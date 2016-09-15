package leczner.jon.BankAccount;

import java.util.ArrayList;

import static leczner.jon.BankAccount.Enums.*;

/**
 * Created by jonathanleczner on 9/14/16.
 */
public class BankAccount {
    protected String accountHolder;
    protected static int accountNumber = 0;
    protected double balance;
    protected double interestRate;
    protected AccountType accountType;
    protected AccountStatus accountStatus;
    protected OverdraftPrevention overdraftProtection;
    protected ArrayList<Transaction> transactions;

    public BankAccount(String accountHolder, AccountType accountType) {
        this.accountHolder = accountHolder;
        this.accountType = accountType;

        accountNumber += 1;
        balance = 0;
        switch (accountType) {
            case CHECKINGS:
                interestRate = 0;
                break;
            case SAVINGS:
                interestRate = 0.01;
                break;
            case INVESTMENT:
                interestRate = 1.05;
                break;
            default:
                break;
        }
        accountStatus = AccountStatus.OPEN;
        overdraftProtection = OverdraftPrevention.DISABLED; // maybe make an overloaded constructor to set later
        transactions = new ArrayList<Transaction>();
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public static int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public OverdraftPrevention getOverdraftProtection() {
        return overdraftProtection;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public TransactionStatus processTransaction(double amount, TransactionType type) {
        return null;
    }

    public boolean closeAccount() {
        if (balance == 0) {
            accountStatus = AccountStatus.CLOSED;
            return true;
        } else return false;
    }
}
