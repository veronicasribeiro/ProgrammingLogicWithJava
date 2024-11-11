package com.example.Vectors;

import java.util.Scanner;

public class ProblemHeightsPositionResolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = scanner.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextDouble();
        }

        double maiorValor = vetor[0];
        int posicaoMaior = 0;

        for (int i = 0; i < n; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
                posicaoMaior = i;
            }
        }

        System.out.println("\nMAIOR VALOR = " + maiorValor);
        System.out.println("POSICÃO DO MAIOR VALOR = " + posicaoMaior);


        scanner.close();
    }
}
