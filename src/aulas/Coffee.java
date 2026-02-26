package aulas;

public class Coffee {
    public static void main(String[] args) {

        int cupsOfCoffee = 1;

        while (cupsOfCoffee <= 100){
            cupsOfCoffee++;
            System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
        }

        for (int cupsOfCoffee2 = 1; cupsOfCoffee2 <= 100; cupsOfCoffee2++) {

            System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee2);
        }
    }
}
