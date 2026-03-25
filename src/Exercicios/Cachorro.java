package Exercicios;

public class Cachorro extends Animal{
    public Cachorro(String nome){
        super(nome);
    }

    public class Dog{
        private String name;
        private int age;
    }

    @Override
    public void fazerSom(){
        System.out.println("Au Au!");
    }

    @Override
    public String getTipo(){
        return "Cachorro";
    }

    public void abanarRabo(){
        System.out.println(nome + " está abanando o rabo." );
    }
}
