package br.com.tt.programa;

import br.com.tt.model.CategoriaProduto;
import br.com.tt.model.Estoque;
import br.com.tt.model.Produto;

import java.util.ArrayList;
import java.util.List;

import static br.com.tt.model.CategoriaProduto.BEBIDA;
import static br.com.tt.model.CategoriaProduto.SALGADO;

public class Aplicacao {

    private static List<Estoque> estoque = new ArrayList<>();

    public static void main(String[] args) {
        criaEstoqueInicial();
        /*
        mostraItensParaUsuario();
        pedeNumeroItem();
        solicitaPagamento();
        dispensaProduto();
        ...
        */
    }

    private static void criaEstoqueInicial() {
        Produto cocaCola = new Produto((short) 1, 6.50F, "Coca Cola", BEBIDA);
        Produto doritos = new Produto((short) 1, 8.25F, "Doritos", SALGADO);

        estoque.add(new Estoque(cocaCola, 10));
        estoque.add(new Estoque(cocaCola, 5));
        estoque.add(new Estoque(doritos, 8));
    }

/*
    public static void adicionaEstoque(short codigo, float preco, String descricao){
        Produto cocaCola = new Produto(codigo++, preco, descricao);
        Estoque estoqueCoca = new Estoque(cocaCola, 10);
        estoque.add(estoqueCoca);
    }
*/
}
