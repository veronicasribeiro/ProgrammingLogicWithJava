package com.example.funcao;

import java.util.Scanner;

public class ProblemaMenorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite cinco número inteiros: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int n5 = scanner.nextInt();


        // pensando em outras formas de utilizar a função
        //int auxiliar = mostrarMenorDeTres(n1, n2, n3);
        //int menor = mostrarMenorDeTres(auxiliar, n4, n5);

        int menor = mostrarMenorDeTres(mostrarMenorDeTres(n1,n2,n3), n4, n5);
        System.out.println("Menor = " + menor);

        scanner.close();
    }

    // costumamos colocar nomes diferentes nos parâmetros para enfatizar que pode ser outros nomes (nesse caso foi igual)
    public static int mostrarMenorDeTres(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }
}
