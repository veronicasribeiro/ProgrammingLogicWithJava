package com.example.funcao;

import java.util.Scanner;

public class ProblemaTabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Voce quer a tabuada de qual numero? ");
        int n = scanner.nextInt();

        mostrarTabuada(n);

        scanner.close();
    }

    // Função que não retornar valor (procedimentos) - retorno "void"
    public static void mostrarTabuada(double n) {
        for (int i = 0; i < 10; i++) {
            System.out.println(n + " X " + (i + 1) + " = " + (n * (i + 1)));
        }
    }
}
