package com.example.Matrizes;

import java.util.Scanner;

public class ProblemaSomaMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas linhas vai ter cada matriz? ");
        int n = scanner.nextInt();
        System.out.print("Quantas colunas vai ter cada matriz? ");
        int m = scanner.nextInt();

        int[][] matrizA = new int[n][m];
        int[][] matrizB = new int[n][m];
        int[][] matrizC = new int[n][m];

        System.out.println("Digite os valores da matriz A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite os valores da matriz B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        System.out.println("MATRIZ SOMA: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrizC[i][j] = 0;
                matrizC[i][j] = matrizC[i][j] + matrizA[i][j] + matrizB[i][j];
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
