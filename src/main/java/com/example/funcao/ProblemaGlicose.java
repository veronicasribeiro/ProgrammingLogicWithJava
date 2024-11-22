package com.example.funcao;

import java.util.Scanner;

public class ProblemaGlicose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da glicose: ");
        double glicose = scanner.nextDouble();

        System.out.println("Classificação: " + mostrarGlicose(glicose));

        scanner.close();
    }

    public static String mostrarGlicose(double glicose) {
        if (glicose <= 100) {
            return ("Normal");
        } else if (glicose > 100 && glicose <= 140) {
            return ("Elevado");
        } else {
            return ("Diabetes");
        }
    }
}
