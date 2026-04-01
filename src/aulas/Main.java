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
    }
}
