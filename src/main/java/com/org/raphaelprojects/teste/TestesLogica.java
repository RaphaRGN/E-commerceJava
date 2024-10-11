package com.org.raphaelprojects.teste;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TestesLogica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Chocolate marca1Chocolate = new Chocolate("Garoto", "Barra de chocolate 23g",
                23.00, true, true);

        Chocolate marca2Chocolate = new Chocolate("Nestlé", "Barra de chocolate 30g",
                27.00, false, true);

        Chocolate marca3Chocolate = new Chocolate("CacauBlumenau", "Barra Diet de chocolate 40g",
                35.00, false, false);

        Fruta frutamaca = new Fruta("Maçã", 20.00, "Maçã Olinda", LocalDate.of(2024, 12, 9));

        while (true) {
            System.out.println("Bem vindo ao Mercado da Velha Central ! \n Digite uma das opções abaixo:" +
                    " \n 1 - Hortifruti \n 2 - Bomboniere  \n 3 - Alimentos");


            int OpcaoSetor = scanner.nextInt();


            switch (OpcaoSetor) {

                case 1:

                    System.out.println("Abaixo estão os produtos desta seção:");
                    System.out.println("Nome: " + frutamaca.nome + "\nPreço no KG: " + frutamaca.precoKG +
                            "\nDescrição: " + frutamaca.descricao + " \nData de vencimento: " + frutamaca.dataVencimento);
                    break;


                case 2:
                    String Condicao;
                    if (marca1Chocolate.presencaAcucar) {
                        Condicao = "Contém";
                    } else {
                        Condicao = "Não contém";
                    }

                    System.out.println("Abaixo estão os produtos desta seção:");
                    System.out.println("Nome: " + marca1Chocolate.nomeMarca + "\nDescrição: " + marca1Chocolate.descricao +
                            "\nPreço: " + marca1Chocolate.preco + "\nPresença Áçucar: " + Condicao);


            }
        }
    }
}

class Alimento {

    public String nome;
    public double preco;
    public String descricao;
    public LocalDate dataVencimento;

}

class CarrinhoCompras{

    private ArrayList<Alimento> itens;
    private double total;

  public double getTotal(Alimento item){

      itens.add(item);
      total += item.preco;
      return total;
  }

}
class Fruta extends Alimento{

    public double precoKG;

    public Fruta (String nome, double precoKG, String descricao, LocalDate dataVencimento){

        this.nome = nome;
        this.precoKG = precoKG;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;

    }

}

class Chocolate extends Alimento{

    public String nomeMarca;
    public boolean presencaAcucar;
    public boolean presencaLactose;

    public Chocolate(String nomeMarca, String descricao, double preco, boolean presencaAcucar, boolean presencaLactose){

        this.nomeMarca = nomeMarca;
        this.descricao = descricao;
        this.preco = preco;
        this.presencaLactose = presencaLactose;
        this.presencaAcucar = presencaAcucar;

    }
}



