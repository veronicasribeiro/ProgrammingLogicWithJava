package com.example.Vectors;

import java.util.Scanner;

public class DesafioConcurso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a quantidade de pessoas? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] nomes = new String[n];
        double[] notas1 = new double[n];
        double[] notas2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();
            System.out.print("Nota etapa 1: ");
            notas1[i] = scanner.nextDouble();
            System.out.print("Nota etapa 2: ");
            notas2[i] = scanner.nextDouble();

            scanner.nextLine();
        }

        System.out.println("\nTABELA");

        double soma;
        double[] media = new double[n];
        for (int i = 0; i < n; i++) {
            soma = notas1[i] + notas2[i];
            media[i] = soma / 2;
            System.out.println(nomes[i] + ", " + notas1[i] + ", " + notas2[i] + ", MÉDIA = " + media[i]);
        }

        System.out.println("\nPESSOAS APROVADAS: ");

        int countAprovados = 0;
        for (int i = 0; i < n; i++) {
            if (media[i] >= 70) {
                System.out.println(nomes[i]);
                countAprovados++;
            }
        }

        double porcentagemDeAprovacao = ((double) countAprovados / n) * 100;
        System.out.println("\nPorcentagem de aprovação: " + porcentagemDeAprovacao + "%");

        double maiorMedia = media[0];
        int posicaoMaiorMedia = 0;
        for (int i = 0; i < n; i++) {
            if (media[i] > maiorMedia) {
               maiorMedia = media[i];
               posicaoMaiorMedia = i;
            }
        }

        System.out.println("Maior média: " + nomes[posicaoMaiorMedia]);

        double somaDosAprovados = 0;

        for (int i = 0; i < n; i++) {
            if (media[i] >= 70) {
                somaDosAprovados = somaDosAprovados + media[i];
            }
        }

        double mediaDosAprovados = somaDosAprovados / countAprovados;

        System.out.println("Nota média dos aprovados: " + mediaDosAprovados);
        
        scanner.close();
    }
}
