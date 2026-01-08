package com.example.produto_api.dtos;

import java.math.BigDecimal;

public class ProdutoResponseDTO {

    private String nome;
    private BigDecimal preco;
    private Integer quantidade;
    private BigDecimal valorEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorEstoque() {
        return valorEstoque;
    }

    public void setValorEstoque(BigDecimal valorEstoque) {
        this.valorEstoque = valorEstoque;
    }
}
