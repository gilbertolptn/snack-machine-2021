package br.com.tt.model;

/*
 * Representa a fileira de produtos da máquina
 * [] [] [] -> 3 fileiras que podem ter produtos iguais ou diferentes
 * [] [] []
 * [] [] []
 */
public class Estoque {
    //Com o produto dentro do estoque fica
    //Mais fácil gerenciar no main()
    private Produto produto;
    private Integer quantidade;

    public Estoque(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    /*public Estoque(short idProduto, Float precoProduto, String descricaoProduto, Integer quantidade) {
        this.produto = new Produto(idProduto, precoProduto, descricaoProduto);
        this.quantidade = quantidade;
    }*/

}
