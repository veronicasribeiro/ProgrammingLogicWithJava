package com.example.funcao;

import java.util.Scanner;

public class ProblemaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base do retangulo: ");
        double baseRetangulo = scanner.nextDouble();
        System.out.print("Digite o valor da altura do retangulo: ");
        double alturaRetangulo = scanner.nextDouble();

        double diagonalRetangulo = calcularDiagonalRetangulo(baseRetangulo, alturaRetangulo);
        double areaRetangulo = calcularAreaRetangulo(baseRetangulo, alturaRetangulo);
        double perimetroRetangulo = calcularPerimetroRetangulo(baseRetangulo, alturaRetangulo);

        System.out.println("Diagonal = " + diagonalRetangulo);
        System.out.println("Área = " + areaRetangulo);
        System.out.println("Perimetro = " + perimetroRetangulo);

        scanner.close();
    }

    public static double calcularDiagonalRetangulo(double baseRetangulo, double alturaRetangulo) {
        return Math.sqrt(Math.pow(baseRetangulo, 2) + Math.pow(alturaRetangulo, 2));
    }

    public static double calcularAreaRetangulo(double baseRetangulo, double alturaRetangulo) {
        return baseRetangulo * alturaRetangulo;
    }

    public static double calcularPerimetroRetangulo(double baseRetangulo, double alturaRetangulo) {
        return 2 * (baseRetangulo * alturaRetangulo);
    }
}
