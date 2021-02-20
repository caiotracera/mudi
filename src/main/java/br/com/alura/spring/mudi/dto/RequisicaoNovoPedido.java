package br.com.alura.spring.mudi.dto;

import br.com.alura.spring.mudi.model.Pedido;
import br.com.alura.spring.mudi.model.StatusPedido;

import javax.validation.constraints.NotBlank;

public class RequisicaoNovoPedido {

  @NotBlank
  private String nomeProduto;

  @NotBlank
  private String urlProduto;

  @NotBlank
  private String urlImagem;

  @NotBlank
  private String descricao;

  public String getNomeProduto() {
    return this.nomeProduto;
  }

  public void setNomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
  }

  public String getUrlProduto() {
    return this.urlProduto;
  }

  public void setUrlProduto(String urlProduto) {
    this.urlProduto = urlProduto;
  }

  public String getUrlImagem() {
    return this.urlImagem;
  }

  public void setUrlImagem(String urlImagem) {
    this.urlImagem = urlImagem;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Pedido toPedido() {
    Pedido pedido = new Pedido();
    pedido.setProductName(nomeProduto);
    pedido.setDescription(descricao);
    pedido.setProductUrl(urlProduto);
    pedido.setImageUrl(urlImagem);
    pedido.setStatus(StatusPedido.AGUARDANDO);

    return pedido;
  }
}
