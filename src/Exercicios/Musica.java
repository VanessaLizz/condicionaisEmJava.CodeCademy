package Exercicios;

public class Musica {
    String nome;
    String artista;

    static void main(String[] args) {
        Musica m1 = new Musica();
        m1.nome = "Someone like you";
        m1.artista = "Adele";
        Musica m2 = m1;
        m2.nome = "Skyfall";

        System.out.println("O nome da música é: " + m1.nome + ", e a cantora é: " + m1.artista);
    }
}
