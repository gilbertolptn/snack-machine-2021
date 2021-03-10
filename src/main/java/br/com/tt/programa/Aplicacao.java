package br.com.tt.programa;

import br.com.tt.model.Estoque;
import br.com.tt.model.Produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Aplicacao {

    private static List<Estoque> estoque = new ArrayList<>();

    public static void main(String[] args) {

        /*
        criaEstoqueInicial();
        mostraItensParaUsuario();
        pedeNumeroItem();
        solicitaPagamento();
        dispensaProduto();
        ...
        */
    }

    private static void criaEstoqueInicial() {
        Produto cocaCola = new Produto();
        estoque.add(new Estoque(cocaCola, 10));

    }
}
