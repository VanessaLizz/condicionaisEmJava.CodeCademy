package Exercicios;

public class Cartao extends Pagamento{
    public Cartao(double valor, String cliente){
        super(valor, cliente);
    }
    public void parcelar(int nParcelas){
        System.out.println("Pagamento parcelado em " + nParcelas + " vezes");
    }
}
