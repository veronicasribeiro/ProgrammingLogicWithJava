package com.example.funcao;

import java.util.Scanner;

public class ProblemaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com as medidas do triângulo X: ");
        double medidasX1 = scanner.nextDouble();
        double medidasX2 = scanner.nextDouble();
        double medidasX3 = scanner.nextDouble();

        System.out.println("Entre com as medidas do triângulo Y: ");
        double medidasY1 = scanner.nextDouble();
        double medidasY2 = scanner.nextDouble();
        double medidasY3 = scanner.nextDouble();

        double areaX = calcularTriangulo(medidasX1, medidasX2, medidasX3);
        double areaY = calcularTriangulo(medidasY1, medidasY2, medidasY3);

        System.out.println("Area de X = " + areaX);
        System.out.println("Area de Y = " + areaY);

        scanner.close();
    }

    // A função tem intenção de ser um pedaço de código genérico que funciona para qualquer valor
    public static double calcularTriangulo(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
