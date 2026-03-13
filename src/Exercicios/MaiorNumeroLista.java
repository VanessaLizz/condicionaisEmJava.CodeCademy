package Exercicios;

public class MaiorNumeroLista {
    public static void main(String[] args) {
        int[] numeros = {50, 32, 154, 12, 26};

        int resultadoMaior = acharNumero(numeros);
        System.out.println("O maior número da lista é: " + resultadoMaior);
    }

    public static int acharNumero(int[] numeros){
        int maiorNumero = numeros[0];
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > maiorNumero){
                maiorNumero = numeros[i];
            }
        }
        return maiorNumero;
    }
}
