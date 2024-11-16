package com.example.Matrizes;

import java.util.Scanner;

public class ProblemaAcimaDiagonal {
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

        int soma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                soma = soma + matriz[i][j];
            }
        }

        System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + soma);

        scanner.close();
    }
}
