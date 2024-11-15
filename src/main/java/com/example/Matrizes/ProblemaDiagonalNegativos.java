package com.example.Matrizes;

import java.util.Scanner;

public class ProblemaDiagonalNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nDIAGONAL PRINCIPAL: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        int quantidadeDeNegativos = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    quantidadeDeNegativos++;
                }
            }
        }

        System.out.println("\nQUANTIDADE DE NEGATIVOS = " + quantidadeDeNegativos);

        scanner.close();
    }
}
