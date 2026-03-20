package Exercicios;

public class SerieConteudo extends CatalogoStreaming {
    public SerieConteudo(String titulo, int duracao){
        super(titulo, duracao);
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Tipo de Conteúdo: Série");
        super.exibirDetalhes();
    }

    public void proximoEpisodio(){
        System.out.println("Carregando próximo episodio!");
    }
}
