package com.example.Vectors;

import java.util.Scanner;

public class ProblemHeightsResolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] nomes = new  String[n];
        int[] idades = new  int[n];
        double[] alturas = new double[n];

        double soma = 0;
        double media, porcentagem;
        int cont = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();
            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();
            System.out.print("Altura: ");
            alturas[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        for (int i = 0; i < n; i++) {
            soma = soma + alturas[i];
        }

        media = soma / n;
        System.out.println("\nAltura média: " + media);

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                cont++;
            }
        }

        porcentagem = (double) cont * 100 / n;
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        scanner.close();
    }
}
