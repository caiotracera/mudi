package br.com.alura.spring.mudi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido {
  private String productName;
  private BigDecimal price;
  private LocalDate deliveryDate;
  private String productUrl;
  private String imageUrl;
  private String description;

  public String getProductName() {
    return this.productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public BigDecimal getPrice() {
    return this.price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public LocalDate getDeliveryDate() {
    return this.deliveryDate;
  }

  public void setDeliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  public String getProductUrl() {
    return this.productUrl;
  }

  public void setProductUrl(String productUrl) {
    this.productUrl = productUrl;
  }

  public String getImageUrl() {
    return this.imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
}
