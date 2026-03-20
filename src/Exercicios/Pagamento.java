package Exercicios;

import java.util.ArrayList;

public class Pagamento {
    double valor;
    String cliente;

    public Pagamento(double valor, String cliente){
        this.valor = valor;
        this.cliente = cliente;
    }

    public void exibirResumo(){
        System.out.println("Resumo da conta: \n " + "Cliente: " + cliente + "\n Saldo da conta: R$ " + valor);
    }

    public static void main(String[] args) {
        ArrayList<Pagamento> lista = new ArrayList<>();
        lista.add(new Pix(257.48, "Emily"));
        lista.add(new Pix(412.63, "Aiden"));
        lista.add(new Cartao(78.45, "Patch"));
        lista.add(new Pix(1258.23, "Rhysand"));
        lista.add(new Cartao(848.49, "Trenton"));

        for (Pagamento p : lista){
            p.exibirResumo();

            if (p instanceof Cartao){
                Cartao c = (Cartao) p;
                c.parcelar(3);
            } else {
                System.out.println("Pagamento realizado por pix!");
            }
        }
    }
}
