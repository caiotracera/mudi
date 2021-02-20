package br.com.alura.spring.mudi.controller;

import br.com.alura.spring.mudi.model.Pedido;
import br.com.alura.spring.mudi.model.StatusPedido;
import br.com.alura.spring.mudi.repository.PedidoRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {

  @Autowired
  private PedidoRepository pedidoRepository;

  @GetMapping
  public ModelAndView home(Model model) {
    List<Pedido> pedidos = pedidoRepository.findAll();
    ModelAndView mv = new ModelAndView("home");
    mv.addObject("pedidos", pedidos);

    return mv;
  }

  @GetMapping("/{status}")
  public ModelAndView porStatus(@PathVariable("status") String status, Model model) {
    List<Pedido> pedidos = pedidoRepository.findByStatus(StatusPedido.valueOf(status.toUpperCase()));
    ModelAndView mv = new ModelAndView("home");
    mv.addObject("pedidos", pedidos);

    return mv;
  }

  @ExceptionHandler(IllegalArgumentException.class)
  public String onError() {
    return "redirect:/home";
  }
}
