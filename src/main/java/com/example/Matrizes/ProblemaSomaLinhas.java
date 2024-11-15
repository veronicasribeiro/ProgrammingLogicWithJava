package com.example.Matrizes;

import java.util.Scanner;

public class ProblemaSomaLinhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a quantidade de linhas da matriz? ");
        int n = scanner.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz? ");
        int m = scanner.nextInt();

        int[][] matriz = new int[n][m];
        int[] vetorSoma = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os elementos da " + (i + 1) + "a. linha: ");
            for (int j = 0; j < m; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int soma = 0;
            for (int j = 0; j < m; j++) {
                soma = soma + matriz[i][j];
            }
            vetorSoma[i] = soma;
        }

        System.out.println("VETOR GERADO: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vetorSoma[i]);
        }

        scanner.close();
    }
}
