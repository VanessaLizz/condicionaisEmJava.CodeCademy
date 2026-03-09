package Exercicios;

public class Jogo {
    String nome;
    String plataforma;

    static void main(String[] args) {
        Jogo j1 = new Jogo();
        Jogo j2 = new Jogo();

        j1.nome = "Minecraft";
        j1.plataforma = "PC";
        j2.nome = "Zelda";
        j2.plataforma = "Nintendo";

        System.out.println("O nome do jogo 1 é: " + j1.nome + ", e é jogado no " + j1.plataforma + ".");
        System.out.println("O nome do jogo 2 é: " + j2.nome + ", e é jogado no " + j2.plataforma);
    }
}
