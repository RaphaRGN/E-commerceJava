package com.org.raphaelprojects.teste;

public class Hortifruti {

    public void getHortifruti(Fruta fruta){
        System.out.println("Abaixo estão os produtos desta seção:");
        System.out.println("Nome: " + fruta.nome + "\nPreço no KG: " + fruta.precoKG +
                "\nDescrição: " + fruta.descricao + " \nData de vencimento: " + fruta.dataVencimento);

    }
}
