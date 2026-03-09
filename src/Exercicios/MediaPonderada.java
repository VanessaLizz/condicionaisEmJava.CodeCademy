package Exercicios;

public class MediaPonderada {
    public static void main(String[] args) {
        double nota1 = 7.55;
        double nota2 = 8.06;
        double nota3 = 6.5;

        int pesoN1 = 2;
        int pesoN2 = 3;
        int pesoN3 = 5;
        double media = (nota1*pesoN1 + nota2*pesoN2 + nota3*pesoN3) / 10;

        System.out.printf("A média ponderada é de: %.2f", media);
    }
}
