package com.tnsif.assignmentthree;

public class BankingMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Bank bank2 = new Bank();

        SavingsAccount savings = new SavingsAccount("Priya", 5000, 5);
        CheckingAccount checking = new CheckingAccount("Kiran", 3000, 2000);

        Transaction transaction = new Transaction();

        System.out.println("Initial Account Details:");
        savings.displayAccountInfo();
        checking.displayAccountInfo();

        System.out.println("\nPerforming Transactions:");
        transaction.performTransaction(savings, "deposit", 1000);
        transaction.performTransaction(checking, "withdraw", 2500);

        System.out.println("\nFinal Account Details:");
        System.out.println("Savings Account Balance (with interest): " + savings.getBalance());
        System.out.println("Checking Account Balance: " + checking.getBalance());

        System.out.println("\nTotal Bank Accounts Created: " + Bank.getTotalAccounts());
    }
}
