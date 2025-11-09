package com.tnsif.assignmentthree;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Savings Account");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account");
        } else {
            System.out.println("Insufficient balance in Savings Account");
        }
    }

    @Override
    public double getBalance() {
        return balance + (balance * interestRate / 100);
    }
}
