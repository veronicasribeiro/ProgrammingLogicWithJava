package com.example.Matrizes;

import java.util.Scanner;

public class ProblemaNegativosMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a quantidade de linhas da matriz? ");
        int n = scanner.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz? ");
        int m = scanner.nextInt();

        int[][] matriz = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("VALORES NEGATIVOS: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] < 0) {
                    System.out.println(matriz[i][j]);
                }
            }
        }

        scanner.close();
    }
}
