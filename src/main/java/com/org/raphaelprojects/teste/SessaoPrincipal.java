package com.org.raphaelprojects.teste;

import java.time.LocalDate;
import java.util.Scanner;


public class SessaoPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        /* Instancia dos produtos*/
        Chocolate marca1Chocolate = new Chocolate("Garoto", "Barra de chocolate 23g",
                23.00, true, true);

        Chocolate marca2Chocolate = new Chocolate("Nestlé", "Barra de chocolate 30g",
                27.00, false, true);

        Chocolate marca3Chocolate = new Chocolate("CacauBlumenau", "Barra Diet de chocolate 40g",
                35.00, false, false);

        Fruta frutamaca = new Fruta("Maçã", 20.00, "Maçã Olinda", LocalDate.of(2024, 12, 9));

        Alimentos alimentos1 = new Alimentos("Iogurte Bluyo", 15,
                "Fardo de iogurte Bluyo", LocalDate.of(2025,12,31));

        /*Instancia das seções*/
        Bomboniere bomboniere = new Bomboniere(carrinhoCompras);
        Hortifruti hortifruti = new Hortifruti(carrinhoCompras);
        Diversos diversos = new Diversos(carrinhoCompras);

        boolean Continuar = true;
        while (Continuar) {
            System.out.println("""
                    Bem vindo ao Mercado da Velha Central !\s
                     Digite uma das opções abaixo:\s
                     1 - Hortifruti
                     2 - Bomboniere
                     3 - Alimentos
                     0 - Dar checkout""");

            int OpcaoSetor = scanner.nextInt();
            scanner.nextLine();

            switch (OpcaoSetor) {

                case 1:
                    hortifruti.getHortifruti(frutamaca);
                    break;

                case 2:
                    bomboniere.getBomboniere(marca1Chocolate);
                    break;

                case 3:
                    diversos.getDiversos(alimentos1);
                    break;

                case 0:

                    Continuar = false;

                    double total = carrinhoCompras.getFinal();
                    System.out.println("Obrigado por comprar conosco ! seu total é: " + total);

            }
        }
    }
}