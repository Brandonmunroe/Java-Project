//Main Function
public class Main4{
    public static void main(String[] args){
        //account object
        Account account1 = new Account("2701", "Kordell", 20.00);
        Account account2 = new Account("5373", "Kieron", 150.00);

        //account1
        account1.deposit(500);
        account1.withdraw(50);
        account1.showBalance();

        //account2
        account2.deposit(450);
        account2.withdraw(40);
        account2.showBalance();

        //Customer Objects linked to objects
        Customer customer1 = new Customer("Kordell", 29, account1);
        Customer customer2 = new Customer("Kieron", 33, account2);

        //Customer info
        System.out.println();
        customer1.showCustomerInfo();
        System.out.println();
        customer2.showCustomerInfo();
    }
}