package br.com.alura.spring.mudi.repository;

import br.com.alura.spring.mudi.model.Pedido;
import br.com.alura.spring.mudi.model.StatusPedido;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

	List<Pedido> findByStatus(StatusPedido status);

}
