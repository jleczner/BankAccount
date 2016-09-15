package leczner.jon.BankAccount;

import static leczner.jon.BankAccount.Enums.*;

/**
 * Created by jonathanleczner on 9/14/16.
 */
public class Transaction {
    private double amount;
    private TransactionType type;
    private TransactionStatus transactionStatus;
    private AccountStatus accountStatus;

    public Transaction(double amount, TransactionType type) {
        this.amount = amount;
        this.type = type;
    }

    public TransactionStatus credit(double amount, AccountStatus status) {
        return null;
    }

    public TransactionStatus debit(double amount, AccountStatus status) {
        return null;
    }

    public TransactionStatus transfer(double amount, AccountStatus status) {
        return null;
    }

    public OverdraftPrevention overdraft() {
        return null;
    }

    public TransactionStatus changeStatus(BankAccount account) {
        return null;
    }

    public TransactionStatus changeName(BankAccount account) {
        return null;
    }

    public TransactionStatus changeInterest(BankAccount account) {
        return null;
    }
}
