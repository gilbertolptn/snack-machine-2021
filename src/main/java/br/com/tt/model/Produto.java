package br.com.tt.model;

public class Produto implements Comparable<Produto> {

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

    public String getDescricaoCompleta() {
        return String.format("%d - %s (%s) - R$ %.2f",
                            id, descricao, categoria, preco);
    }

    public Short getId() {
        return id;
    }

    @Override
    public int compareTo(Produto outroProduto) {
/*        if(this.id == null){
            return 1;

        }else if(outroProduto == null || outroProduto.id == null){
            return -1;
        }*/
        //Caso não possa mesmo ficar sem ID... dispara exceção!!
        if(this.id == null || outroProduto == null || outroProduto.id == null){
            throw new IllegalArgumentException("Não podem haver produtos com ID nulo");
        }

        return this.id.compareTo(outroProduto.id);
    }
}
