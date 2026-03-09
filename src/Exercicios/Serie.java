package Exercicios;

public class Serie {
    String titulo;
    int temporadas;

    static void main(String[] args) {
        Serie[] series = new Serie[3];
        series[0] = new Serie();
        series[0].titulo = "The vampire diaries";
        series[1] = new Serie();
        series[1].titulo = "Outlander";
        series[2] = new Serie();
        series[2].titulo = "Game of thrones";
        series[0].temporadas = 12;
        series[1].temporadas = 8;
        series[2].temporadas = 6;

        for (int i = 0; i < series.length; i++){
            System.out.println("O nome da série é: " + series[i].titulo + ", e possui " + series[i]. temporadas + " temporadas.");
        }
    }
}
