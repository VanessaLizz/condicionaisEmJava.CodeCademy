package aulas;

public class Main{
    public static void main(String[] args){
        SavingAccount zeusSavingsAccount = new SavingAccount("Zeus", 1000);

        // Make a call to addMoney() to test your method
        zeusSavingsAccount.addMoney(2000);

        Person emily = new Person(20);
        emily.hasBirthday();
        System.out.println("New age is: " + emily.age);
        System.out.println("New wisdom is: " + emily.wisdom);
        System.out.println("New fitness is: " + emily.fitness);

        //Aplicando herança e polimorfismo

        Spaghetti spaghettiPomodoro = new Spaghetti();
        System.out.println(spaghettiPomodoro.texture);

        //Herdando construtor

        Pho phoChay = new Pho();
        System.out.println(phoChay.shape);

        Dinner noodlesDinner = new Dinner();
        Noodle biangBiang = new BiangBiang();

        noodlesDinner.makeNoodles(biangBiang, "soy sauce and chili oil");

        Noodle spaghetti, ramen, pho;

        spaghetti = new Spaghetti();
        ramen = new Ramen();
        pho = new Pho();

        // Add your code below:
        Noodle[] allTheNoodles = {spaghetti, ramen, pho};
        for(Noodle noodle: allTheNoodles){
            System.out.println(noodle.getCookPrep());
        }

        NoodleRestaurant customer1 = new NoodleRestaurant();

        customer1.wait(pho);

        //MATRIZES BIDIMENSIONAIS

        // Declare a 2d array of float values called floatTwoD
        float[][] floatTwoD;
        floatTwoD = new float[4][10];

        char[][] ticTacToe = {{'X', 'O', 'O'}, {'O', 'X', ' '}, {'X', ' ', 'X'}};
        ticTacToe = new char[][] {{'O', 'X', 'X'}, {'X', 'O', ' '}, {'O', ' ', 'O'}};

        // Using the provided 2D array
        int[][] intMatrix = {
                {1, 1, 1, 1, 1},
                {2, 4, 6, 8, 0},
                {9, 8, 7, 6, 5}
        };
        int retrievedInt = intMatrix[0][3];
        System.out.println(retrievedInt);

        int result = intMatrix[1][2] * 3;
        System.out.println(result);
    }
}
