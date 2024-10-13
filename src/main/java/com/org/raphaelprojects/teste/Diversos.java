package com.org.raphaelprojects.teste;

public class Diversos {

    public void getDiversos(Alimentos alimentos){

        System.out.println("Abaixo estão os produtos desta seção:");
        System.out.println("Nome: " + alimentos.nome + "\nPreço: " + alimentos.preco +
                "\nDescrição: " + alimentos.descricao + " \nData de vencimento: " + alimentos.dataVencimento);

    }
}
