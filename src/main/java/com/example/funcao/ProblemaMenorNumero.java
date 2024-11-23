package com.example.funcao;

import java.util.Scanner;

public class ProblemaMenorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três número inteiros: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int menor = mostrarMenorNumero(a, b, c);

        System.out.println("Menor = " + menor);

        scanner.close();
    }

    // costumamos colocar nomes diferentes nos parâmetros para enfatizar que pode ser outros nomes (nesse caso foi igual)
    public static int mostrarMenorNumero(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }
}
