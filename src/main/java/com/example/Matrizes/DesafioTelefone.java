package com.example.Matrizes;

import java.util.Scanner;

public class DesafioTelefone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de clientes: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] nomes = new String[n];
        String[] telefones = new String[n];
        int[] tipos = new int[n];
        double[] minutos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados do " + (i + 1) + "o. cliente: ");
            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();
            System.out.print("Telefone: ");
            telefones[i] = scanner.nextLine();
            System.out.print("Tipo: ");
            tipos[i] = scanner.nextInt();
            System.out.print("Minutos: ");
            minutos[i] = scanner.nextDouble();

            scanner.nextLine();
        }

        double[][] tiposDeAssinatura = new double[3][2];

        System.out.println("\nInforme o preco basico e excedente de cada tipo de conta: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Tipo: " + i + ": ");
            tiposDeAssinatura[i][0] = scanner.nextDouble();
            tiposDeAssinatura[i][1] = scanner.nextDouble();
        }

        System.out.println("\nRELATÓRIO DE CLIENTES:\n");

        for (int i = 0; i < n; i++) {
            double precoBasico = tiposDeAssinatura[tipos[i]][0];
            double precoExcedente = tiposDeAssinatura[tipos[i]][1];
            double minutosExcedidos = Math.max(0, minutos[i] - 90);

            double valorDaConta = precoBasico + (minutosExcedidos * precoExcedente);

            System.out.print(nomes[i] + ", " + telefones[i] + ", Tipo " + tipos[i] + ", Minutos: " + minutos[i] +
                    ", Conta = R$ " + valorDaConta);

            System.out.println();
        }

        scanner.close();
    }
}
