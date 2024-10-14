package com.org.raphaelprojects.teste;

import java.util.Scanner;

public class Hortifruti {
    Scanner scanner = new Scanner(System.in);
    private CarrinhoCompras carrinhoCompras;
    public Hortifruti(CarrinhoCompras carrinhoCompras){

        this.carrinhoCompras = carrinhoCompras;

    }

    public void getHortifruti(Fruta fruta){
        System.out.println("Abaixo estão os produtos desta seção:");
        System.out.println("Nome: " + fruta.nome + "\nPreço no KG: " + fruta.precoKG +
                "\nDescrição: " + fruta.descricao + " \nData de vencimento: " + fruta.dataVencimento);

        System.out.println("Gostaria de adicionar algum item ao carrinho ? \n 1- Sim \n 2- Não");

        int carrinho = scanner.nextInt();

        switch (carrinho){


            case 1:

              double total = carrinhoCompras.getTotal(fruta);
              System.out.println("Adicionado ! seu sub total é: " + total);


        }

    }
}
