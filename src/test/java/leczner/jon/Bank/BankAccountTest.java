package leczner.jon.Bank;

import org.junit.Test;
import static org.junit.Assert.*;

import static leczner.jon.Bank.Enums.*;

/**
 * Created by jonathanleczner on 9/14/16.
 */
public class BankAccountTest {
     BankAccount checkings = new BankAccount("Jon Leczner", AccountType.CHECKINGS);
     BankAccount savings = new BankAccount("Jon Leczner", AccountType.SAVINGS);

    @Test
     public void closeAccountTest() {
        assertEquals(AccountStatus.OPEN, checkings.getAccountStatus());
        checkings.closeAccount();
        assertEquals(AccountStatus.CLOSED, checkings.getAccountStatus());
    }

    @Test
    public void processDebitTest() {
        Transaction debit = new Transaction(5.00, TransactionType.DEBIT);
    }

    @Test
    public void processCreditTest() {

    }

    @Test
    public void processStatusTest() {

    }

    @Test
    public void processNameTest() {

    }

    @Test
    public void processInterestTest() {

    }


}
