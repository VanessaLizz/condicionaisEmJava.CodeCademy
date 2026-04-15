package aulas;

public class CheckingAccount{
    public String name;
    private int balance;
    private String id;
    private double interestRate;


    public CheckingAccount(String inputName, int inputBalance, String inputId){
        this.name = inputName;
        this.balance = inputBalance;
        this.id = inputId;
        this.interestRate = 0.02;
    }

    public void addFunds(int fundsToAdd){
        balance += fundsToAdd;
    }

    public void getInfo(){
        System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
    }

    public void printBalance() {
        System.out.println("Account balance is " + balance);
    }

    public void setBalance(int newBalance){
        this.balance = newBalance;
    }

    public void getAccountInformation(){
        System.out.println("Money in account: " + this.getBalance());
        System.out.println("Next Month's Interest: " + this.calculateNextMonthInterest());
    }

    int getBalance(){
        return this.balance;
    }

    private double calculateNextMonthInterest(){
        double calculateNextMonthInterest = balance * interestRate;
        return calculateNextMonthInterest;
    }

}
