package br.com.alura.spring.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.spring.mudi.model.Pedido;

@Controller
public class HomeController {
  @GetMapping("/home")
  public String home(Model model) {
    Pedido pedido = new Pedido();
    pedido.setProductName("Novo Echo Dot (4ª Geração)");
    pedido.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71Z2bLQ8NmL._AC_SL1000_.jpg");
    pedido.setProductUrl("https://www.amazon.com.br/Staging-Product-Not-Retail-Sale/dp/B084KV8YRR/ref=sr_1_2?adgrpid=79538892205&dchild=1&gclid=EAIaIQobChMI47Wo5cy65wIVh5OzCh2n_gvhEAAYASAAEgIT6_D_BwE&hvadid=392981439977&hvdev=c&hvlocphy=1001729&hvnetw=g&hvpos=1t1&hvqmt=e&hvrand=13273148385699143269&hvtargid=kwd-297108252919&hydadcr=5621_10696862&keywords=amazon&qid=1613764115&sr=8-2&tag=hydrbrgk-20");
    pedido.setDescription("Lorem Ipsum");
    
    List<Pedido> pedidos = Arrays.asList(pedido);
    model.addAttribute("pedidos", pedidos);

    return "home";
  }
}
