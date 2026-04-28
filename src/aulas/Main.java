package aulas;

import java.util.Arrays;

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

        // Declare and initialize a 2D array called subMatrix
        int[][] subMatrix;
        subMatrix = new int[2][2];

        subMatrix[0][0] = intMatrix[0][0] * 5;
        subMatrix[0][1] = intMatrix[0][1] * 5;
        subMatrix[1][0] = intMatrix[1][0] * 5;
        subMatrix[1][1] = intMatrix[1][1] * 5;

        System.out.println(Arrays.deepToString(subMatrix));

        int tableSize = 10;
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print(i * j);
                System.out.print(" ");
            }
            System.out.println();
        }

        //Given the provided 2d array
        int[][] intMatrix2 = {
                { 4,  6,  8, 10, 12, 14, 16},
                {18, 20, 22, 24, 26, 28, 30},
                {32, 34, 36, 38, 40, 42, 44},
                {46, 48, 50, 52, 54, 56, 58},
                {60, 62, 64, 66, 68, 70, 79}
        };

        int rows = intMatrix2.length;
        int columns = intMatrix2[0].length;

        int sum = 0;
        for(int i=0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                // Add a line to calculate sum of all elements
                sum+=intMatrix2[i][j];
            }
        System.out.println(sum);
        }

        //ITERANDO ARRAYS DE FORMAS DIFERENTES
        int[][] binary = {
                {0, 1, 0, 1},
                {1, 1, 1, 0},
                {1, 0, 0, 1},
                {1, 0, 1, 0}
        };
        int onesCount = 0;
        for (int[] row : binary) {
            for (int i: row) {
                onesCount += i;
            }
        }
        System.out.println(onesCount);
        String[][] wordData = {{"study", "consider", "examine", "learn"}, {"ponder", "read", "think", "cogitate"}};
        int i = 0, j = 0;
        while (i < wordData.length) {
            j = 0;
            while (j < wordData[i].length) {
                System.out.println(wordData[i][j] + ": [" + i + "]" + "[" + j + "]");
                j++;
            }
            i++;
        };
    }
}
