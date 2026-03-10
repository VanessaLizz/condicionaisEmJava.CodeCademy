package Exercicios;

public class ExercicioFuncao1 {
    static void mostrarMensagem(){
        System.out.println("Estou aprendendo funções em Java!");
    }
    static String mostrarNome(String nome){
        return nome;
    }

    static int dobrarNumero(int numero){
        return numero * 2;
    }

    static int somarNumeros (int a, int b){
        return a + b;
    }

    static double calcularMedia(double a, double b, double c){
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        mostrarMensagem();

        String resultado = mostrarNome("Sabrina Carpenter!");
        System.out.println("O nome mostrado é: " + resultado);

        int resultadoDobro = dobrarNumero(10);
        System.out.println("O dobro de 10 é: " + resultadoDobro);

        int resultadoSoma = somarNumeros(10, 20);
        System.out.println("O resultado da somar de 10 + 20 é: " + resultadoSoma);

        double resultadoMedia = calcularMedia(8.25, 10, 7.4);
        System.out.printf("A média da notas 8,25 + 10 + 7,4 é: %.2f", resultadoMedia);
    }
}
