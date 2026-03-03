package Exercicios;

public class Pessoa {
    String nome;

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Manuela";
        System.out.println(p1.nome);

        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        System.out.println(livro1.titulo);
        Livro livro2 = new Livro();
        livro2.titulo = "1984";
        Livro livro3 = new Livro();
        livro3.titulo = "O Pequeno Principe";
        System.out.println(livro2.titulo + ", " + livro3.titulo);

        Livro l1 = new Livro();
        l1.titulo = "Harry Potter";
        Livro l2 = l1;
        l2.titulo = "O Senhor dos Anéis";
        System.out.println(l1.titulo);


        Celular celular = new Celular();
        celular.marca = "Samsung";
        System.out.println(celular.marca);

        Carro carro = new Carro();
        carro.modelo = "Civic";
        carro. ano = 2022;
        System.out.println(carro.modelo + " " + carro.ano);

        Pessoas P1 = new Pessoas();
        P1.nome = "Carlos";
        P1.idade = 30;
        System.out.println(P1.nome + ", " + P1.idade);
        Pessoas P2 = new Pessoas();
        P2.nome = "Talita";
        P2.idade = 16;
        System.out.println(P2.nome + ", " + P2.idade);
        Pessoas P3 = P2;
        P3.nome = "Raquel";
        System.out.println(P3.nome);
    }
}

class Livro{
    String titulo;
}

class Celular{
    String marca;
}

class Carro {
    String modelo;
    int ano;
}

class Pessoas {
    String nome;
    int idade;
}
