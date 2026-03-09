package Exercicios;

public class DescontoProduto {
    public static void main(String[] args) {
        double preco = 150.0;
        double desconto;
        desconto = preco * 0.10;
        double precoFinal = preco - desconto;

        System.out.println("O valor do desconto é de: " + desconto + ". O valor final do produto é de: " + precoFinal);
    }
}
