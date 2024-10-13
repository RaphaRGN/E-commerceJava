package com.org.raphaelprojects.teste;

public class Bomboniere {

    public void getBomboniere(Chocolate chocolate){

        String Condicao = chocolate.presencaAcucar ? "Contém" : "Não contém";
        System.out.println("Bem vindo a sessão Bomboniere ! Escolha uma das opções abaixo: \n 1- Ver os produtos \n 2- Voltar para sessão inicial");

        System.out.println("Abaixo estão os produtos desta seção:");
        System.out.println("Nome: " + chocolate.nomeMarca + "\nDescrição: " + chocolate.descricao +
                "\nPreço: " + chocolate.preco + "\nPresença Áçucar: " + Condicao);

        System.out.println("Gostaria de adicionar algum item ao carrinho ? \n 1- Sim \n 2- Não");

    }

}
