package com.example.funcao;

/*
    Função: Também chamada de subprograma ou sub-rotina

    Qual a importância do uso de funções?
    * Dividir um problema grande em problemas menores
    * Organizar o código
        - Delegar funcionalidades para funções
        - Legibilidade
    * Reaproveitar código


 */

import java.util.Scanner;

public class SobreFuncao {
    public static void main(String[] args) {
        // Programa para calcular a média de 2 números utilização função
        Scanner scanner = new Scanner(System.in);
        double altura1;
        double altura2;
        double resultado;

        System.out.println("Digite duas alturas: ");
        altura1 = scanner.nextDouble();
        altura2 = scanner.nextDouble();

        resultado = calcularMedia(altura1, altura2);

        System.out.println("RESULTADO = " + resultado);

        scanner.close();
    }
    // Tipo de retorno   // Nome da Função  // Parâmetros (ou argumentos)
    public static double calcularMedia(double num1, double num2) {
        return (num1 + num2) / 2;       // vai receber (altura1, altura2)
    }
} // Metodo calcularMedia está DENTRO da classe!

// As funções podem ter as variáveis dela -- As variáveis das funções só existem na execução da função