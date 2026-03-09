package Exercicios;

public class Celulares {
    String marca;
    String modelo;
    double preco;

    public static void main(String[] args) {
        Celulares[] celular = new Celulares[3];
        celular[0] = new Celulares();
        celular[0].marca = "Apple";
        celular[0].modelo = "Iphone 13 Pro Max";
        celular[0].preco = 4500.00;

        celular[1] = new Celulares();
        celular[1].marca = "Samsung";
        celular[1].modelo = "Galaxy Y";
        celular[1].preco = 950.00;

        celular[2] = new Celulares();
        celular[2].marca = "Xiaomi";
        celular[2].modelo = "Readmi Note 9";
        celular[2].preco = 2499.99;

        for (int i = 0; i < celular.length; i++){
            System.out.println("O telefone da marca " + celular[i].marca + ", de modelo " + celular[i].modelo + ", custa " + celular[i].preco);
            if (celular[i].preco >= 2000){
                System.out.println("O celular " + celular[i].modelo + " custa acima de 2 mil reais.");
            }
        }

    }
}
