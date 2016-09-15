package leczner.jon.Bank;

import java.util.ArrayList;

import static leczner.jon.Bank.Enums.*;

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
                interestRate = Bank.checkingsInterestRate;
                break;
            case SAVINGS:
                interestRate = Bank.savingsInterestRate;
                break;
            case INVESTMENT:
                interestRate = Bank.investmentInterestRate;
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

    public void addToTransactionList(Transaction trans) {transactions.add(trans);}

    public void displayTransactionHistory() { return; }

    public String balanceInquiry() {
        if (accountStatus == AccountStatus.FROZEN)
            return "ACCOUNT FROZEN: BALANCE INFORMATION CURRENTLY UNAVAILABLE";
        else
            return accountNumber + ": " + accountType + "\n" + "Current balance: " + balance;
    }

    public boolean closeAccount() {
        if (balance == 0) {
            accountStatus = AccountStatus.CLOSED;
            return true;
        } else return false;
    }
}
