package br.com.fiap.cervejaria.dto;

import java.math.BigDecimal;

public class PrecoCervejaDTO {

    public PrecoCervejaDTO(){

    }

    private BigDecimal preco;

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public PrecoCervejaDTO(BigDecimal preco) {
        this.preco = preco;
    }
}
