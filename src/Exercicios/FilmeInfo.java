package Exercicios;

public class FilmeInfo {
    String titulo;
    int duracao;

    public static void main(String[] args) {
        FilmeInfo[] filmes = new FilmeInfo[3];
        filmes[0] = new FilmeInfo();
        filmes[1] = new FilmeInfo();
        filmes[2] = new FilmeInfo();

        filmes[0].titulo = "O senhor dos áneis";
        filmes[0].duracao = 325;
        filmes[1].titulo = "Harry Potter e o cálice de fogo";
        filmes[1].duracao = 85;
        filmes[2].titulo = "O silêncio dos inocentes";
        filmes[2].duracao = 128;

        listarFilmes(filmes);
    }

    static void listarFilmes(FilmeInfo[] filmes){
         for (int i = 0; i < filmes.length; i++){
            System.out.println("O nome do filme é: " + filmes[i].titulo + " e possui duração de " + filmes[i].duracao + " minutos");
        }
    }
}
