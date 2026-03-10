package Exercicios;

public class Idade {
    static void mostrarIdade(int idade){
        System.out.println("A minha idade é: " + idade);
    }

    static void maiorNumero(int a, int b){
        if (a > b){
            System.out.println("O maior número é: " + a);
        } else {
            System.out.println("O maior número é: " + b);
        }
    }

    static int converterParaSegundos(int a){
        int convertido = a * 60;
        return convertido;
    }

    public static void main(String[] args) {
        mostrarIdade(29);
        mostrarIdade(84);

        maiorNumero(29, 84);

        int numeroConvertido = converterParaSegundos(45);
        System.out.println("45 minutos tem " + numeroConvertido + " segundos.");
    }
}
