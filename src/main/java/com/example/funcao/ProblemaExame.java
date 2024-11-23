package com.example.funcao;

import java.util.Scanner;

public class ProblemaExame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Medida de glicose: ");
        double glicose = scanner.nextDouble();
        mostrarGlicose(glicose);

        System.out.print("Medida de triglicerídeos: ");
        double triglicerideos = scanner.nextDouble();
        mostrarTriglicerideos(triglicerideos);

        System.out.print("Medida de colesterol: ");
        double colesterol = scanner.nextDouble();
        mostrarColesterol(colesterol);

        scanner.close();
    }

    public static void mostrarGlicose(double glicose) {
        if (glicose <= 100) {
            System.out.println("Classificação: Normal");
        } else if (glicose > 100 && glicose <= 140) {
            System.out.println("Classificação: Elevado");
        } else {
            System.out.println("Classificação: Diabetes");
        }
    }

    public static void mostrarTriglicerideos(double triglicerideos) {
        if (triglicerideos <= 200) {
            System.out.println("Classificação: Desejável");
        } else {
            System.out.println("Classificação: Aumentado");
        }
    }

    public static void mostrarColesterol(double colesterol) {
        if (colesterol <= 200) {
            System.out.println("Classificação: Desejável");
        } else if (colesterol > 200 && colesterol <= 240) {
            System.out.println("Classificação: Limiar");
        } else {
            System.out.println("Classificação: Elevado");
        }
    }

}
