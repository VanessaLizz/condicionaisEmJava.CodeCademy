package Exercicios;

public class Gato extends Animal{
    public Gato(String nome){
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("Miiiaaauuuu!");
    }

    @Override
    public String getTipo(){
        return "Gato";
    }

    public static void main(String[] args) {
        Gato meuGato = new Gato("Alfredo");
        meuGato.fazerSom();
    }
}
