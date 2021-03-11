package br.com.tt.model;

public class Produto {
    private Short id;
    private Float preco;
    private String descricao;
    private CategoriaProduto categoria;

    public Produto(Short id, Float preco, String descricao, CategoriaProduto categoria) {
        this.id = id;
        this.preco = preco;
        this.descricao = descricao;
        this.categoria = categoria;
    }
}
