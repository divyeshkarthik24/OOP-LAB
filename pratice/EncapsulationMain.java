class SecureBankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private int transactionCount; 

    
    public SecureBankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.setAccountHolderName(accountHolderName); 
        
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Error: Initial balance cannot be negative. Setting to $0.0");
            this.balance = 0.0;
        }
        this.transactionCount = 0;
    }

    
    public String getAccountNumber() {
        return accountNumber; 
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
    
    public int getTransactionCount() {
        return transactionCount;
    }

   
    public void setAccountHolderName(String newName) {
        if (newName != null && newName.length() >= 3) {
            this.accountHolderName = newName;
        } else {
            System.out.println("Error: Account holder name must be at least 3 characters.");
        }
    }

 
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionCount++;
            System.out.println("Success: Deposited $" + amount + ". New Balance: $" + balance);
        } else {
            System.out.println("Error: Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionCount++;
            System.out.println("Success: Withdrawn $" + amount + ". New Balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Error: Insufficient funds for withdrawal!");
        } else {
            System.out.println("Error: Invalid withdrawal amount!");
        }
    }
}

public class EncapsulationMain {
    public static void main(String[] args) {
        System.out.println("--- Encapsulation Demo ---");
        SecureBankAccount myAccount = new SecureBankAccount("ACCT-999888", "Jo", 500.0); // Will trigger name error
     
        myAccount.setAccountHolderName("John Doe");
        
       
        myAccount.deposit(150.0);
        myAccount.withdraw(700.0);
        myAccount.withdraw(100.0);
        
        System.out.println("\nFinal Account Info:");
        System.out.println("Name: " + myAccount.getAccountHolderName());
        System.out.println("Balance: $" + myAccount.getBalance());
        System.out.println("Total Transactions: " + myAccount.getTransactionCount());
    }
}