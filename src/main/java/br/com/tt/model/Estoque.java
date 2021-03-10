package br.com.tt.model;

public class Estoque {
    //Com o produto dentro do estoque fica
    //Mais fácil gerenciar no main()
    private Produto produto;
    private Integer quantidade;

    public Estoque(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
