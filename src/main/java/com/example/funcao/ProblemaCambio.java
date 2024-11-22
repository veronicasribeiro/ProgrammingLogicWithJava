package com.example.funcao;

import java.util.Scanner;

public class ProblemaCambio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotacao do dolar: ");
        double cotacaoDolar = scanner.nextDouble();
        System.out.print("Digite a quantia em reais:  ");
        double valorReal = scanner.nextDouble();

        double valorDolar = calcularValorEmDolar(valorReal, cotacaoDolar);

        System.out.println("Voce pode comprar " + valorDolar + " dolares com esta quantia");

        scanner.close();
    }

    public static double calcularValorEmDolar(double valorReal, double cotacaoDoDolar) {
        return valorReal / cotacaoDoDolar;
    }
}
