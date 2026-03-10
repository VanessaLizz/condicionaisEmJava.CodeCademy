package Exercicios;

public class calcularTriplo {
    static int valorTriplo(int a, int b, int c){
        int soma = a + b + c;
        return soma * 3;
    }

    static double calcularDesconto(double a){
        double desconto = a * 0.10;
        return a - desconto;
    }

    static int somarTresNumeros(int a, int b, int c){
        int somaDeTres = a + b + c;
        return somaDeTres;
    }

    public static void main(String[] args) {
        int resultadoSoma = valorTriplo(20, 100, 35);
        System.out.println(resultadoSoma);

        double valorComDesconto = calcularDesconto(50);
        System.out.println("O valor final com desconto é de: " + valorComDesconto);

        int resultado = somarTresNumeros(54, 37, 82);
        System.out.println(resultado);
    }
}
