package com.org.raphaelprojects.teste;

import java.util.Scanner;

public class Diversos {
    Scanner scanner = new Scanner(System.in);
    private CarrinhoCompras carrinhoCompras;

    public Diversos (CarrinhoCompras carrinhoCompras){

        this.carrinhoCompras = carrinhoCompras;

    }
    public void getDiversos(Alimentos alimentos){

        System.out.println("Abaixo estão os produtos desta seção:");
        System.out.println("Nome: " + alimentos.nome + "\nPreço: R$ " + alimentos.preco +
                "\nDescrição: " + alimentos.descricao + " \nData de vencimento: " + alimentos.dataVencimento);
        System.out.println("Gostaria de adicionar algum item ao carrinho ? \n 1- Sim \n 2- Não");

        int carrinho = scanner.nextInt();

        switch (carrinho){


            case 1:

                double total = carrinhoCompras.adicionarItem(alimentos);
                System.out.println("Adicionado ! seu sub total é: R$ " + total);

                break;

            case 2:

                System.out.println("Voltando...");

                break;

            default:
                System.out.println("Opção inválida !");
                break;


        }




    }
}
