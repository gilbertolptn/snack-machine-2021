package br.com.tt.programa;

import br.com.tt.model.Estoque;
import br.com.tt.model.Produto;

import java.util.*;

import static br.com.tt.model.CategoriaProduto.BEBIDA;
import static br.com.tt.model.CategoriaProduto.SALGADO;

public class Aplicacao {

    private static List<Estoque> estoques = new ArrayList<>();

    public static void main(String[] args) {
        criaEstoqueInicial();
        mostraItensParaUsuario();
        /*
        pedeNumeroItem();
        solicitaPagamento();
        dispensaProduto();
        ...
        */
    }

    private static void mostraItensParaUsuario() {
        Set<Produto> produtosDisponiveis = new TreeSet<>();
        for(Estoque estoque : estoques){
            if(estoque.temDisponivel()){
                produtosDisponiveis.add(estoque.getProduto());
            }
        }

        System.out.println("\nItens disponíveis: ");
        for (Produto produto : produtosDisponiveis){
            //1 - Coca Cola - R$ 6.50
            System.out.println(produto.getDescricaoCompleta());
        }
    }

    private static void criaEstoqueInicial() {
        Produto cocaCola = new Produto((short) 1, 6.50F, "Coca Cola", BEBIDA);
        Produto doritos = new Produto((short) 2, 8.25F, "Doritos", SALGADO);
        Produto aguaSemGas = new Produto((short) 3, 5F, "Água sem gás", BEBIDA);
        Produto aguaComGas = new Produto((short) 4, 5F, "Água com gás", BEBIDA);

        estoques.add(new Estoque(cocaCola, 10));
        estoques.add(new Estoque(cocaCola, 5));
        estoques.add(new Estoque(doritos, 8));
        estoques.add(new Estoque(aguaSemGas, 20));
        estoques.add(new Estoque(aguaComGas, 10));
    }

/*
    public static void adicionaEstoque(short codigo, float preco, String descricao){
        Produto cocaCola = new Produto(codigo++, preco, descricao);
        Estoque estoqueCoca = new Estoque(cocaCola, 10);
        estoque.add(estoqueCoca);
    }
*/
}
