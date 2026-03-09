package Exercicios;

public class Filme {
    String titulo;
    int duracao;

    static void main(String[] args) {
        Filme f1 = new Filme();
        f1.titulo = "Interestelar";
        f1.duracao = 169;
        System.out.println("O nome do filme é: " + f1.titulo + ", e a duração é de " + f1.duracao + " minutos.");
    }
}
