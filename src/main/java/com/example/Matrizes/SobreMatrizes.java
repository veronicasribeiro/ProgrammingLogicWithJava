package com.example.Matrizes;

import java.util.Scanner;

public class SobreMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas linhas vai ter a matriz? ");
        int m = scanner.nextInt();
        System.out.print("Quantas colunas vai ter a matriz? ");
        int n = scanner.nextInt();

        int[][] matriz = new int[m][n]; // [linha] [coluna]

        // Percorre todas as linhas da matriz
        for (int i = 0; i < m; i++) {
            // percorre todas as colunas da matriz
            for (int j = 0; j < n; j++) {
                // varredura de todos os elementos da matriz
                System.out.print("Elemento [" + i + "," + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMATRIZ DIGITADA: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // para quebrar as linhas e aparecer formatado
        }

        scanner.close();
    }
}
