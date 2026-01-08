package com.example.produto_api.repository;

import com.example.produto_api.model.Produto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProdutoRepository {

    private List<Produto> produtos = new ArrayList<>();

    public void salvar(Produto produto){
        produtos.add(produto);
    }

    public List<Produto> listar(){
        return produtos;
    }
}
