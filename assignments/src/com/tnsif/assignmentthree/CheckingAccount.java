package com.tnsif.assignmentthree;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountHolder, double balance, double overdraftLimit) {
        super(accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Checking Account");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Checking Account");
        } else {
            System.out.println("Withdrawal exceeds overdraft limit");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
