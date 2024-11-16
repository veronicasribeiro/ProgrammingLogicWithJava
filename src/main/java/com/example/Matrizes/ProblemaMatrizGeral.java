package com.example.Matrizes;

import java.util.Scanner;

public class ProblemaMatrizGeral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int n = scanner.nextInt();

        double[][] matriz = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        double somaDosPositivos = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > 0) {
                    somaDosPositivos = somaDosPositivos + matriz[i][j];
                }
            }
        }

        System.out.println("\nSOMA DOS POSITIVOS: " + somaDosPositivos);

        System.out.print("\nEscolha uma linha: ");
        int linhaEscolhida = scanner.nextInt();
        System.out.print("LINHA ESCOLHIDA: ");
        for (int j = 0; j < n; j++) {
            System.out.print(matriz[linhaEscolhida][j] + " ");
        }

        System.out.print("\n\nEscolha uma coluna: ");
        int colunaEscolhida = scanner.nextInt();
        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][colunaEscolhida] + " ");
        }

        System.out.print("\n\nDIAGONAL PRINCIPAL: ");
        for (int i = 0; i < n; i++) {
            double diagonalPrincipal;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    diagonalPrincipal = matriz[i][j];
                    System.out.print(diagonalPrincipal + " ");
                }
            }
        }

        System.out.println("\n\nMATRIZ ALTERADA: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = Math.pow(matriz[i][j], 2);
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
