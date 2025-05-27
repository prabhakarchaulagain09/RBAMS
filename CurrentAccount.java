public class CurrentAccount extends BankAccount {
    private double overdraftLimit;
    
    public CurrentAccount(String ownerName, String accountNumber, double initialBalance, double overdraftLimit) {
        super(ownerName, accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }
    

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        
        if (amount > (balance + overdraftLimit)) {
            throw new InsufficientBalanceException("Exceeds overdraft limit. Available balance with overdraft: " + (balance + overdraftLimit));
        }
        
        balance -= amount;
        System.out.println(amount + " withdrawn. New balance: " + balance);
    }

    public String getAccountType() {
        return "Current Account";
    }
    
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
