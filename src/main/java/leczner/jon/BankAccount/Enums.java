package leczner.jon.BankAccount;

/**
 * Created by jonathanleczner on 9/14/16.
 */
public class Enums {
    public enum AccountType {CHECKINGS, SAVINGS, INVESTMENT}
    public enum AccountStatus {OPEN, CLOSED, FROZEN}
    public enum OverdraftProtection {ENABLED, DISABLED, AUTOTRANSFER}
    public enum TransactionStatus {APPROVED, DENIED}
    public enum TransactionType {DEBIT, CREDIT, TRANSFER}
}
