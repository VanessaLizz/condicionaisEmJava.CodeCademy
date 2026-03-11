package Exercicios;

public class MediaPrecos {
    double valorProduto;
    public static void main(String[] args) {
        MediaPrecos[] precos = new MediaPrecos[4];
        precos[0] = new MediaPrecos();
        precos[0].valorProduto = 85.47;
        precos[1] = new MediaPrecos();
        precos[1].valorProduto = 345.99;
        precos[2] = new MediaPrecos();
        precos[2].valorProduto = 12.32;
        precos[3] = new MediaPrecos();
        precos[3].valorProduto = 1465.0;

        double valorMedia = calcularMedia(precos);
        System.out.printf("A média dos valores dos produtos é: R$ %.2f", valorMedia);
    }

    public static double calcularMedia(MediaPrecos[] listaPrecos){
        double soma = 0;
        for (int i = 0; i < listaPrecos.length; i++){
            soma += listaPrecos[i].valorProduto;
        }
        return soma / listaPrecos.length;
    }
}
