package com.example.funcao;

import java.util.Scanner;

public class ProblemaClassificacaoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();

        mostarIMC(peso, altura);

        scanner.close();
    }

    public static void mostarIMC(double peso, double altura) {
        double imc = peso / Math.pow(altura, 2);

        if (imc < 20) {
            System.out.println("Resultado do IMC: abaixo do peso");
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("Resultado do IMC: peso normal");
        }else if (imc >= 25 && imc <= 30) {
            System.out.println("Resultado do IMC: sobrepeso");
        } else {
            System.out.println("Resultado do IMC: obeso");
        }
    }
}
