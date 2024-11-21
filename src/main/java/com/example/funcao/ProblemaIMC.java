package com.example.funcao;

import java.util.Scanner;

public class ProblemaIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();

        double imc = calcularImc(peso, altura);

        System.out.println("IMC = " + imc);

        scanner.close();
    }

    public static double calcularImc(double peso, double altura) {
        return peso / Math.pow(altura,2);
    }
}
