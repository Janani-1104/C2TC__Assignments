package com.tnsif.assignmentthree;

public final class Transaction {
    private final double transactionFee = 10.0;

    public final void performTransaction(Account account, String type, double amount) {
        if (type.equalsIgnoreCase("deposit")) {
            account.deposit(amount);
        } else if (type.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount + transactionFee);
        } else {
            System.out.println("Invalid transaction type");
        }
        System.out.println("Transaction completed. Fee applied: " + transactionFee);
    }
}
