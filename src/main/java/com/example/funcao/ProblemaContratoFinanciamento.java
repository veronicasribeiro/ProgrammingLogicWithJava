package com.example.funcao;

import java.util.Scanner;

public class ProblemaContratoFinanciamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Valor total: ");
        double total = scanner.nextDouble();
        System.out.print("Valor de entrada: ");
        double entrada = scanner.nextDouble();

        // Como a função não tem um valor de saída, não faz sentido colocar dentro de uma variável
        mostrarRelatorioFinanciamento(nome, total, entrada);

        scanner.close();
    }

    public static void mostrarRelatorioFinanciamento(String nome, double total, double entrada) {
        double restante = total - entrada;
        System.out.println("RELATÓRIO");
        System.out.println("NOME: " + nome);
        System.out.println("VALOR TOTAL: " + total);
        System.out.println("ENTRADA: " + entrada);
        System.out.println("VALOR PARCELADO: " + restante);
    }
}
