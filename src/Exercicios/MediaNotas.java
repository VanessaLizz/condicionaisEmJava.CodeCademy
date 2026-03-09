package Exercicios;

public class MediaNotas {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;
        double media;

        nota1 = 8;
        nota2 = 5.9;
        nota3 = 9.48;

        media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("A média é: %.2f", media);
    }
}
