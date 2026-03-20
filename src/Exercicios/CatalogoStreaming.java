package Exercicios;
import java.util.ArrayList;

public class CatalogoStreaming {
    String titulo;
    int duracao;

    public CatalogoStreaming(String titulo, int duracao){
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public void exibirDetalhes(){
        System.out.println("Título: " + this.titulo + "\n" + "Tempo de duração: " + duracao + " minutos.");
    }

    public static void main(String[] args) {
        ArrayList<CatalogoStreaming> conteudo = new ArrayList<>();
        conteudo.add(new FilmeConteudo("O morro dos ventos uivantes", 168));
        conteudo.add(new SerieConteudo("O rei eterno", 45));

        for (CatalogoStreaming c : conteudo){
            c.exibirDetalhes();

            if (c instanceof FilmeConteudo){
                FilmeConteudo f = (FilmeConteudo) c;
                f.exibirCreditos();

            } else {
                SerieConteudo s = (SerieConteudo) c;
                s.proximoEpisodio();
            }
        }
    }
}
