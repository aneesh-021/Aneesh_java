
package training.oops;

import java.util.*;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    void viewBalance();
    int getAccountNumber();
}

class SavingsAccount implements Account {

    private int accountNumber;
    private double balance;
    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(int accountNumber, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    @Override
    public void viewBalance() {
        System.out.println("Savings Account Balance: " + balance);
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }
}

class CurrentAccount implements Account {

    private int accountNumber;
    private double balance;
    private static final double OVERDRAFT_LIMIT = 5000;

    public CurrentAccount(int accountNumber, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }

    @Override
    public double calculateInterest() {
        return 0.0;
    }

    @Override
    public void viewBalance() {
        System.out.println("Current Account Balance: " + balance);
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }
}

class Bank {

    private List<Account> accounts = new ArrayList<>();
    private static int nextAccountNumber = 1001;

    public void addAccount(Account acc) {
        accounts.add(acc);
        System.out.println("Account created successfully.");
        System.out.println("Account Number: " + acc.getAccountNumber());
    }

    public Account findAccount(int accNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }
        return null;
    }

    public int generateAccountNumber() {
        return nextAccountNumber++;
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {

            System.out.println("\n===== Banking System =====");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. View Balance");
            System.out.println("6. Calculate Interest");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                case 2:
                    System.out.println("Enter initial deposit:");
                    double initial = scanner.nextDouble();

                    int accNo = bank.generateAccountNumber();

                    Account acc = (choice == 1)
                            ? new SavingsAccount(accNo, initial)
                            : new CurrentAccount(accNo, initial);

                    bank.addAccount(acc);
                    break;

                case 3:
                    System.out.println("Enter Account Number:");
                    int depAcc = scanner.nextInt();

                    Account depositAcc = bank.findAccount(depAcc);

                    if (depositAcc != null) {
                        System.out.println("Enter Deposit Amount:");
                        double amount = scanner.nextDouble();
                        depositAcc.deposit(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.println("Enter Account Number:");
                    int wdAcc = scanner.nextInt();

                    Account withdrawalAccount = bank.findAccount(wdAcc);

                    if (withdrawalAccount != null) {
                        System.out.println("Enter Withdrawal Amount:");
                        double withdrawAmount = scanner.nextDouble();
                        withdrawalAccount.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    System.out.println("Enter Account Number:");
                    int vbAcc = scanner.nextInt();

                    Account balAcc = bank.findAccount(vbAcc);

                    if (balAcc != null) {
                        balAcc.viewBalance();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 6:
                    System.out.println("Enter Account Number:");
                    int intAcc = scanner.nextInt();

                    Account interestAcc = bank.findAccount(intAcc);

                    if (interestAcc != null) {
                        double interest = interestAcc.calculateInterest();
                        System.out.println("Interest Amount: " + interest);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                                    case 7:
                    System.out.println("Thank you for Banking with us.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }   
        }       
    }           
}               

                