package com.example.funcao;

import java.util.Scanner;

public class ProblemaSalarioLiquido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salario bruto: ");
        double salarioBruto = scanner.nextDouble();

        double salarioLiquido = calcularSalarioLiquido(salarioBruto);

        System.out.println("Salário líquido = " + salarioLiquido);

        scanner.close();
    }

    public static double calcularImposto(double salarioBruto) {
        double imposto;
        if (salarioBruto <= 4000) {
            imposto = 0.2;
        } else {
            imposto = 0.25;
        }

        return salarioBruto * imposto;
    }

    public static double calcularPrevidencia(double salarioBruto) {
        double previdencia;
        if (salarioBruto <= 1500) {
            previdencia = 0.1;
        } else {
            previdencia = 0.15;
        }

        return salarioBruto * previdencia;
    }

    public static double calcularSalarioLiquido(double salarioBruto) {
        return salarioBruto - calcularImposto(salarioBruto) - calcularPrevidencia(salarioBruto);
    }
}
