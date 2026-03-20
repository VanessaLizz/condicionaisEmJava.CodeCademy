package Exercicios;

public class FilmeConteudo extends CatalogoStreaming {
    public FilmeConteudo(String titulo, int duracao){
        super(titulo, duracao);
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Tipo de Conteúdo: Filme");
        super.exibirDetalhes();
    }

    public void exibirCreditos(){
        System.out.println("Exibindo créditos finais!");
    }
}
