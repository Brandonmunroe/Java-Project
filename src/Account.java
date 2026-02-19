public class Account{
    private String accountNumber;
    private String ownerName;
    private double balance;

    public Account(String accountNumber, String ownerName, double balance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited " + amount + " into " + ownerName + "'s account. ");
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrew " + amount + " out of " + ownerName + "'s account. ");
    }

    public void showBalance(){
        System.out.println("BankAccount " + accountNumber + " has a balance of " + balance);
    }



}
