package com.example.Vectors;

import java.util.Scanner;

public class PeoblemPersonalPersonResolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        double[] alturas = new double[n];
        String[] generos = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            alturas[i] = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Gênero da " + (i + 1) + "a pessoa: ");
            generos[i] = scanner.nextLine();
        }

        double menorAltura = alturas[0], maiorAltura = alturas[0];

        for (int i = 1; i < n; i++) {
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }

            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
        }

        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);

        int contMulheres = 0;
        int contHomens = 0;
        double soma = 0;
        double media;

        for (int i = 0; i < n; i++) {
            if (generos[i].equalsIgnoreCase("f")) {
                soma = soma + alturas[i];
                contMulheres++;
            }

            if (generos[i].equalsIgnoreCase("m")) {
                contHomens++;
            }
        }

        media = soma / contMulheres;
        System.out.println("Média das alturas das mulheres = " + media);

        System.out.println("Número de homens = " + contHomens);

        scanner.close();
    }
}
