package com.example.Matrizes;

import java.util.Scanner;

public class ProblemaCadaLinha {
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

        System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");
        for (int i = 0; i < n; i++) {
            int maiorElemento = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > maiorElemento) {
                    maiorElemento = matriz[i][j];
                }
            }
            System.out.println(maiorElemento);
        }

        scanner.close();
    }
}
