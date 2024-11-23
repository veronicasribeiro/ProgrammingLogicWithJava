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

        double areaX = calcularTrianguloX(medidasX1, medidasX2, medidasX3);
        double areaY = calcularTrianguloY(medidasY1, medidasY2, medidasY3);

        System.out.println("Area de X = " + areaX);
        System.out.println("Area de Y = " + areaY);

        scanner.close();
    }

    public static double calcularTrianguloX(double medidasX1, double medidasX2, double medidasX3) {
        double p = (medidasX1 + medidasX2 + medidasX3) / 2;
        return Math.sqrt(p * (p - medidasX1) * (p - medidasX2) * (p - medidasX3));
    }

    public static double calcularTrianguloY(double medidasY1, double medidasY2, double medidasY3) {
        double p = (medidasY1 + medidasY2 + medidasY3) / 2;
        return Math.sqrt(p * (p - medidasY1) * (p - medidasY2) * (p - medidasY3));
    }
}
