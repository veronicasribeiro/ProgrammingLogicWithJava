package com.example.funcao;

import java.util.Scanner;

public class ProblemaFinanciamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor total do imovel: ");
        double valorTotal = scanner.nextDouble();
        System.out.print("Valor pago na entrada: ");
        double valorDaEntrada = scanner.nextDouble();
        System.out.print("Sera financiado em quantos meses? ");
        int meses = scanner.nextInt();

        double valorDaPrestacao = calcularFinanciamento(valorTotal, valorDaEntrada, meses);

        System.out.println("Valor de cada prestacao: " + valorDaPrestacao);

        scanner.close();
    }

    public static double calcularFinanciamento(double valorTotal, double valorDaEntrada, int meses) {
        return (valorTotal - valorDaEntrada) / meses;
    }
}
