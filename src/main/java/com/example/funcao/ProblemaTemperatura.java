package com.example.funcao;

import java.util.Scanner;

public class ProblemaTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double temperaturaEmF = scanner.nextDouble();

        double celsius = calcularConversao(temperaturaEmF);

        System.out.println("Temperatura em Celsius = " + celsius);

        scanner.close();
    }

    public static double calcularConversao(double temperaturaEmf) {
        return 5.0 / 9.0 * (temperaturaEmf - 32);
    }
}
