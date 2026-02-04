package projetosParaPraticar;
import java.util.Scanner;

public class Continents {
    // o programa irá imprimir um continente e a maior cidade dele
    public static void main(String[] args) {

        //opção para que o usuário escolha o número ao invés de deixar pré definido
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para obter as informações desejadas: ");
        int continent = scanner.nextInt();


        switch (continent) {
            case 1:
                System.out.println("North America: Mexico City, Mexico");
                break;
            case 2:
                System.out.println("South America: Sao Paulo, Brazil");
                break;
            case 3:
                System.out.println("Europe: Moscow, Russia");
                break;
            case 4:
                System.out.println("Africa: Lagos, Nigeria");
                break;
            case 5:
                System.out.println("Asia: Shanghai, China");
                break;
            case 6:
                System.out.println("Oceania: Sydney, Australia");
                break;
            case 7:
                System.out.println("Antarctica: McMurdo Station, US");
                break;
            default:
                System.out.println("Undefined continent. Enter a valid option!");
                break;

        }

    }
}
