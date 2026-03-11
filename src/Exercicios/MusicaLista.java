package Exercicios;

public class MusicaLista {
    String titulo;
    String artista;
    double duracao;

    public static void main(String[] args) {
        MusicaLista[] musicas = new MusicaLista[3];
        musicas[0] = new MusicaLista();
        musicas[0].titulo = "A Little Piece of a Heaven";
        musicas[0].artista = "Avenged Sevenfold";
        musicas[0].duracao = 8.47;
        musicas[1] = new MusicaLista();
        musicas[1].titulo = "Helena";
        musicas[1].artista = "My Chemical Romance";
        musicas[1].duracao = 3.19;
        musicas[2] = new MusicaLista();
        musicas[2].titulo = "Firework";
        musicas[2].artista = "Katy Perry";
        musicas[2].duracao = 4.36;

        listarMusicas(musicas);

    }

    public static void listarMusicas(MusicaLista[] musicas){
        for (int i = 0; i < musicas.length; i++){
            System.out.println("O nome da música é: " + musicas[i].titulo +
                                ", cantada por " + musicas[i].artista +
                                " e possui duração de " + musicas[i].duracao + " minutos.");
        }
    }
}
