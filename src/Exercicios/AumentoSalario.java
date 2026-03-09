package Exercicios;

public class AumentoSalario {
    public static void main(String[] args) {
        double salario = 2500;
        double aumento = salario * 0.15;
        double novoSalario = salario + aumento;

        System.out.println("O salário antigo era de: " + salario + " reais. Teve um reajuste de: " + aumento + ". O salário atual é de: " + novoSalario + " reais.");
    }
}
