package Exercicios;

public class Votacao {
    static void verificarVoto(int a){
        if (a >=18 && a <65){
            System.out.println("Você pode votar!");
        } else if (a >= 65) {
            System.out.println("Você não precisa votar!!");
        } else {
            System.out.println("Você ainda não pode votar.");
        }
    }

    public static void main(String[] args) {
        verificarVoto(25);
        verificarVoto(14);
        verificarVoto(72);
    }
}
