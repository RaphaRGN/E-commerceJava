package com.org.raphaelprojects.teste;

import java.time.LocalDate;

public class Alimentos {

    public String nome;
    public double preco;
    public String descricao;
    public LocalDate dataVencimento;

    public Alimentos (String nome, double preco, String descricao, LocalDate dataVencimento){

        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;

    }

}
class Fruta extends Alimentos {

    public double precoKG;

    public Fruta (String nome, double precoKG, String descricao, LocalDate dataVencimento){

        super (nome, precoKG, descricao, dataVencimento);
        this.precoKG = precoKG;
    }

}

class Chocolate extends Alimentos {

    public String marca;
    public boolean presencaAcucar;
    public boolean presencaLactose;

    public Chocolate(String nomeMarca, String descricao, double preco, boolean presencaAcucar, boolean presencaLactose){

        super(nomeMarca, 0, descricao, LocalDate.of(2024, 12, 31));

        this.marca = nomeMarca;
        this.descricao = descricao;
        this.preco = preco;
        this.presencaLactose = presencaLactose;
        this.presencaAcucar = presencaAcucar;

    }
}

