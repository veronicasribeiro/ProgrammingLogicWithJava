package com.example.funcao;

import java.util.Scanner;

public class DesafioContribuinte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados do contribuinte");
        System.out.print("Renda anual com salário:");
        double salario = scanner.nextDouble();
        System.out.print("Renda anual com prestação de serviço: ");
        double prestacaoDeServico = scanner.nextDouble();
        System.out.print("Renda anual com ganho de capital: ");
        double ganhoCapital = scanner.nextDouble();
        System.out.print("Gastos médicos: ");
        double gastosMedicos = scanner.nextDouble();
        System.out.print("Gastos educacionais: ");
        double gastosEducacionais = scanner.nextDouble();

        double impostoSobreSalario = impostoSobreSalario(salario);
        double impostoSobreServico = impostoSobreServico(prestacaoDeServico);
        double impostoGanhoCapital = impostoSobreGanhoCapital(ganhoCapital);
        double impostoBrutoTotal = impostoBrutoTotal(impostoSobreSalario, impostoSobreServico, impostoGanhoCapital);
        double abatimento = abatimento(impostoSobreSalario, impostoSobreServico, impostoGanhoCapital, gastosMedicos,
                gastosEducacionais);
        double impostoDevido = impostoBrutoTotal - abatimento;

        System.out.println("\nRELATÓRIO: ");
        System.out.println("Imposto sobre salário: " + impostoSobreSalario);
        System.out.println("Imposto sobre serviços: " + impostoSobreServico);
        System.out.println("Imposto sobre ganho de capital: " + impostoGanhoCapital);
        System.out.println("Imposto bruto total: " + impostoBrutoTotal);
        System.out.println("Abatimento: " + abatimento);
        System.out.println("Imposto devido: " + impostoDevido);

        scanner.close();
    }

    public static double impostoSobreSalario(double quantia) {
        quantia = quantia / 12;
        double impostoSalario = 0;
        if (quantia < 3000) {
            System.out.println("Isento");
        } else if (quantia >= 3000 && quantia < 5000) {
            impostoSalario = quantia * 0.10;
        } else {
            impostoSalario = quantia * 0.20;
        }
        return impostoSalario * 12;
    }

    public static double impostoSobreServico(double quantia) {
        double impostoServico = 0;
        if (quantia != 0) {
            impostoServico = quantia * 0.15;
        }
        return impostoServico;
    }

    public static double impostoSobreGanhoCapital(double quantia) {
        double impostoGanhoCapital = 0;
        if (quantia != 0) {
            impostoGanhoCapital = quantia * 0.20;
        }

        return impostoGanhoCapital;
    }

    public static double impostoBrutoTotal(double salario, double servicos, double ganhoCapital) {
        return salario + servicos + ganhoCapital;
    }

    public static double abatimento(double salario, double servicos, double ganhoCapital, double gastosMedicos,
                                    double gastosEducacionais) {
        double impostoBruto = salario + servicos + ganhoCapital;
        double totalGastos = gastosMedicos + gastosEducacionais;
        double abatimento = impostoBruto * 0.30;

        if (totalGastos > abatimento) {
           return abatimento;
        } else {
            return totalGastos;
        }
    }
}
