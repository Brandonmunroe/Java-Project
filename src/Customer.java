public class Customer{
    private String name;
    private int age;
    private Account account;

    public Customer(String name, int age, Account account){
        this.name = name;
        this.age = age;
        this.account = account;
    }
    public void showCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Age: " + age);
        System.out.println("Account: " + account);
    }
}
