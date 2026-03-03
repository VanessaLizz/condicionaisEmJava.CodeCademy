package Exercicios;

public class TiposReferencia {
    public static void main(String[] args) {
        String nome = "Violet";
        System.out.println(nome);
        nome = "Prímula";
        System.out.println(nome);

        //comparando referências

        String a = "Java";
        String b = "Java";
        System.out.println(a == b);
        System.out.println(a.equals(b));
        b = "Python";
        System.out.println(a == b);
        System.out.println(a.equals(b));

        String texto1 = new String("Morro");
        String texto2 = new String("Ventos");
        System.out.println(a == b);
        texto2 = new String("Uivantes");
        System.out.println(texto1.equals(texto2));

        int[] numeros = {1, 2, 3};
        int[] copia = numeros;
        copia[0] = 99;
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        copia = new int[]{4, 5, 6};
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);

        String cor = "Azul";
        System.out.println(cor);
        cor = new String("Verde");
        System.out.println(cor);
        cor = new String("Amarelo");
        System.out.println(cor);

        String palavra1 = "Casa";
        String palavra2 = palavra1;
        System.out.println(palavra1);
        System.out.println(palavra2);
        palavra2 = "Apartamento";
        System.out.println(palavra2);

        int[] numeros2 = {5, 10, 15};
        System.out.println(numeros2[0]);
        System.out.println(numeros2[1]);
        System.out.println(numeros2[2]);
        numeros2[2] = 40;
        System.out.println(numeros2[2]);

        String cidade = null;
        System.out.println(cidade);
        cidade = "Fortaleza";
        System.out.println(cidade);
    }
}
