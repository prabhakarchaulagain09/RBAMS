import java.util.Scanner;

public class RBAMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Rural Bank of Nepal");
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        Customer customer = new Customer(name);
        customer.addAccount(new SavingsAccount(name, "SAV123", 5000, 5.0));
        customer.addAccount(new CurrentAccount(name, "CUR456", 3000, 1000));

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Deposit\n2. Withdraw\n3. Add Interest\n4. View Accounts\n5. Exit\n\t ");

            int choice = sc.nextInt();

            if (choice == 5) break;

            System.out.print("Select account (1: Savings, 2: Current): ");
            int accChoice = sc.nextInt() - 1;

            BankAccount account = customer.getAccount(accChoice);

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double deposit = sc.nextDouble();
                        account.deposit(deposit);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdraw = sc.nextDouble();
                        account.withdraw(withdraw);
                        System.out.println("Withdrawal successful.");
                        break;
                    case 3:
                        if (account instanceof SavingsAccount) {
                            ((SavingsAccount) account).addInterest();
                        } else {
                            System.out.println("Interest not applicable on current accounts.");
                        }
                        break;
                    case 4:
                        customer.showAccounts();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (InsufficientBalanceException e) {
                System.out.println("Withdrawal failed: " + e.getMessage());
            }
        }

        sc.close();
    }
}

