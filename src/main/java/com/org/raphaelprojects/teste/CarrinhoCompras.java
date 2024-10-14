package com.org.raphaelprojects.teste;

import java.util.ArrayList;

public class CarrinhoCompras{

    private ArrayList<Alimentos> itens = new ArrayList<>();
    private double total;

    public double getTotal(Alimentos item){

        itens.add(item);
        total += item.preco;
        return total;
    }

    public double getFinal() {

        return total;

    }

}