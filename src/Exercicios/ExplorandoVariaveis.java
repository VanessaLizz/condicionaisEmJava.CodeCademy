package Exercicios;

public class ExplorandoVariaveis {
    static void main(String[] args) {
        String cidade = "Itaitinga";
        int ano = 2026;
        double temperatura = 32.7;
        boolean chovendo = false;
        System.out.println(cidade + ", " + ano + ", " + temperatura + ", " + chovendo);

        cidade = "Fortaleza";
        temperatura = 35.4;

        System.out.println(cidade + ", " + ano + ", " + temperatura + ", " + chovendo);

        int populacao;
        populacao = 2497315;

        System.out.println(populacao);

        if (true){
            String mensagem = "A população de Fortaleza é maior que a de Itaitinga!";
            System.out.println(mensagem);
        }

        final String PAIS = "Brasil";
        System.out.println(PAIS);

    }

}
