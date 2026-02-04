package aulas;

//criação de uma calculadora de financiamento de veículos - projeto prático da codecademy

public class CarLoan {
    public static void main(String[] args) {
        int carLoan = 10000; //valor a ser financiado
        int loanLength = 3; //prazo em anos para pagar o empréstimo
        int interestRate = 5; //taxa de juros de 5%
        int downPayment = 2000; //valor de entrada a ser pago

        if (loanLength <= 0 && interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan. Try Again!");
        }
        else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full!");
        }
        else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months; //pagamento mensal sem juros
            int interest = (monthlyBalance * interestRate) / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }
    }
}