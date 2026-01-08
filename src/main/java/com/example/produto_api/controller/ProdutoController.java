package com.example.produto_api.controller;

import com.example.produto_api.dtos.ProdutoRequestDTO;
import com.example.produto_api.dtos.ProdutoResponseDTO;
import com.example.produto_api.model.Produto;
import com.example.produto_api.repository.ProdutoRepository;
import com.example.produto_api.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @Autowired
    private ProdutoService service;

    @PostMapping
    public ResponseEntity<Void> criar(@RequestBody ProdutoRequestDTO request) {
        Produto produto = new Produto();
        produto.setNome(request.getNome());
        produto.setPreco(request.getPreco());
        produto.setQuantidade(request.getQuantidade());

        repository.salvar(produto);

        return ResponseEntity.status(201).build();
    }

    @GetMapping
    public ResponseEntity<List<ProdutoResponseDTO>> listar() {
        List<ProdutoResponseDTO> response = repository.listar()
                .stream()
                .map(produto -> {
                    ProdutoResponseDTO dto = new ProdutoResponseDTO();
                    dto.setNome(produto.getNome());
                    dto.setPreco(produto.getPreco());
                    dto.setQuantidade(produto.getQuantidade());
                    dto.setValorEstoque(
                            service.calcularValorEstoque(
                                    produto.getPreco(), produto.getQuantidade()
                            )
                    );
                    return dto;
                })
                .collect(Collectors.toList());

        return ResponseEntity.ok(response);
    }
}
