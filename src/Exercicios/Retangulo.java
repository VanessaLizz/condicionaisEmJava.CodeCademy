package Exercicios;

public class Retangulo {
    static double calcularAreaRetangulo(double a, double b){
        double largura = a;
        double altura = b;
        double area = largura * altura;
        return area;
    }

    static void verificarParOuImpar(int a){
        if (a % 2 == 0){
            System.out.println("O número é par.");
        } else{
            System.out.println("O número é ímpar.");
        }
    }

    public static void main(String[] args) {
        double calculo = calcularAreaRetangulo(10.45, 2.73);
        System.out.printf("O cálculo da área total é: %.2f", calculo);

        verificarParOuImpar(7);
    }
}
