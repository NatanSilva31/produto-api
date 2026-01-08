package com.example.produto_api.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProdutoService {

    public BigDecimal calcularValorEstoque(BigDecimal preco, Integer quantidade){
        return preco.multiply(BigDecimal.valueOf(quantidade));
    }
}
