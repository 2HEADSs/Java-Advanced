package DefiningClasses;

public class BankAccount {

    private static double interestRate = 0.02;
    private  static int idCounter = 1;
    private int id;
    private double balance;

    public double getInterest(int years) {
        return interestRate * years *balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public BankAccount(){
        this.id = idCounter;
        idCounter++;
    }
    public int getId() {
        return id;
    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
}
