package Exercicios;
import java.util.ArrayList;

public class Animal {
    String nome;
    public Animal(String nome){
        this.nome = nome;
    }

    public void fazerSom(){
        System.out.println("Som genérico");
    }

    public String getTipo(){
        return "Animal genérico";
    }

    public static void exibirDados(Animal a){
        System.out.println("Nome do animal: " + a.nome + ", Raça do animal: " + a.getTipo());
    }

    public void verificarEnergia(int horasDeSono){
        if (horasDeSono >= 8){
            System.out.println("O animal " + this.nome + " está descansado.");
        } else {
            System.out.println("O animal " + this.nome + " está cansado.");
        }
    }

    public static void main(String[] args) {
        ArrayList<Animal> listaDeAnimais = new ArrayList<>();
        listaDeAnimais.add(new Cachorro("Belinha"));
        listaDeAnimais.add(new Gato("Alfredo"));

        for (Animal a : listaDeAnimais){
            exibirDados(a);
            if (a instanceof Cachorro){
                Cachorro c = (Cachorro) a;
                c.abanarRabo();
            }
        }

        Animal cachorro = new Cachorro("Belinha");
        cachorro.fazerSom();

        Gato meuGato = new Gato("Alfredo");

        Cachorro cachorroReal = (Cachorro) cachorro;
        cachorroReal.abanarRabo();

        exibirDados(cachorroReal);
        exibirDados(meuGato);

        cachorro.verificarEnergia(5);
        meuGato.verificarEnergia(8);
    }
}
