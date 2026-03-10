package Exercicios;

public class Mensagem {
    static void mostrarSaudacao(String nome, String curso){
        System.out.println("Olá " + nome + ", seja bem-vinda ao curso de " + curso);
    }

    public static void main(String[] args) {
        mostrarSaudacao("Roberta", "Música");
    }
}
