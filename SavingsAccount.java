public class SavingsAccount extends BankAccount {
    private double interestRate;
    
    public SavingsAccount(String ownerName, String accountNumber, double initialBalance, double interestRate) {
        super(ownerName, accountNumber, initialBalance);
        this.interestRate = interestRate;
    }
    

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Current balance: " + balance);
        }
        
        balance -= amount;
        System.out.println(amount + " withdrawn. New balance: " + balance);
    }
    
    public void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: " + interest + ". New balance: " + balance);
    }
    

    public String getAccountType() {
        return "Savings Account";
    }
    
    public double getInterestRate() {
        return interestRate;
    }
}
