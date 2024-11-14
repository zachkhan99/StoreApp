public class Customer {
    private String name;
    private double balance;

    public Customer(String name) {
        this.name = name;
        this.balance = 0.0;  // Default balance
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double amount) {
        this.balance += amount;
    }

    public void deductBalance(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
