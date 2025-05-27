public abstract class BankAccount {
    protected String accountNumber;
    protected double balance;
    protected String ownerName;
    
    public BankAccount(String ownerName, String accountNumber, double initialBalance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    public abstract String getAccountType();
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public abstract void withdraw(double amount) throws InsufficientBalanceException;
    
    public double getBalance() {
        return balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountDetails() {
        return "Account Holder: " + ownerName +
               "\nAccount Number: " + accountNumber +
               "\nBalance: " + balance +
               "\nAccount Type: " + getAccountType();
    }
    

    public String toString() {
        return getAccountType() + " - Account Number: " + accountNumber + ", Balance: " + balance;
    }
}
