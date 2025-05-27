# Rural Bank Account Management System (RBAMS)

This is a console-based Java application that simulates a simple banking system for the Rural Bank of Nepal. The system helps customers manage savings and current accounts with secure operations, interest calculations, and overdraft management.

---

## 👩‍💻 Features
- Open savings and current accounts
- Deposit and withdraw money with rules
- Add interest to savings accounts
- Handle overdraft limit for current accounts
- View all accounts of a customer
- Handle errors using custom exceptions

---

## 📦 Class Design

### 1. `BankAccount` (Abstract Class)
- Attributes: `accountHolderName`, `accountNumber`, `balance`
- Methods: `deposit()`, `withdraw()`, `getAccountDetails()`

### 2. `SavingsAccount`
- Inherits `BankAccount`
- Adds method `addInterest()`

### 3. `CurrentAccount`
- Inherits `BankAccount`
- Allows overdraft withdrawal

### 4. `Customer`
- Aggregates multiple accounts
- Displays all account details

### 5. `InsufficientBalanceException`
- Custom exception thrown during invalid withdrawals

---

## 📸 Screenshots

### 1. Deposit Operation
![Deposit Success](screenshots/deposit_success.png)

### 2. Withdrawal with Exception
![Withdrawal Exception](screenshots/withdrawal_exception.png)

### 3. Interest Addition
![Interest Added](screenshots/interest_added.png)

