import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<BankAccount> accounts;
    
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }
    
    public void addAccount(BankAccount account) {
        accounts.add(account);
        System.out.println(account.getAccountType() + " added for " + name);
    }
    
    public BankAccount getAccount(int index) {
        if (index >= 0 && index < accounts.size()) {
            return accounts.get(index);
        } else {
            System.out.println("Invalid account index.");
            return null;
        }
    }
    
    public void showAccounts() {
        System.out.println("\nAccounts for " + name + ":");
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println((i + 1) + ". " + accounts.get(i));
        }
    }
    
    public String getName() {
        return name;
    }
}
