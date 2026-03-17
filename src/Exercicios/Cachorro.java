package Exercicios;

public class Cachorro extends Animal{
    public Cachorro(String nome){
        super(nome);
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
