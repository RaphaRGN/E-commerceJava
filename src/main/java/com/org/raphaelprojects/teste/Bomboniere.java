package com.org.raphaelprojects.teste;

import java.util.Scanner;
import  com.org.raphaelprojects.teste.CarrinhoCompras;

public class Bomboniere {
    public CarrinhoCompras carrinhoCompras;
    public Bomboniere (CarrinhoCompras carrinhoCompras){

        this.carrinhoCompras = carrinhoCompras;

    }
    public void getBomboniere(Chocolate chocolate){
        Scanner scanner = new Scanner(System.in);

        String Condicao = chocolate.presencaAcucar ? "Contém" : "Não contém";
        System.out.println("Bem vindo a sessão Bomboniere ! Escolha uma das opções abaixo: \n 1- Ver os produtos \n 2- Voltar para sessão inicial");

        System.out.println("Abaixo estão os produtos desta seção:");
        System.out.println("Nome: " + chocolate.nomeMarca + "\nDescrição: " + chocolate.descricao +
                "\nPreço: " + chocolate.preco + "\nPresença Áçucar: " + Condicao);

        System.out.println("Gostaria de adicionar algum item ao carrinho ? \n 1- Sim \n 2- Não");
        int Carrinho = scanner.nextInt();

        switch (Carrinho){

            case 1:

               double total = carrinhoCompras.getTotal(chocolate);
               System.out.println("Adicionado, seu total é: " + total);
               break;


            case 2:

                System.out.println("Voltando...");
                break;
        }

    }

}


