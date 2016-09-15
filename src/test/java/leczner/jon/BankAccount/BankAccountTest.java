package leczner.jon.BankAccount;

import org.junit.Test;
import static org.junit.Assert.*;

import static leczner.jon.BankAccount.Enums.*;

/**
 * Created by jonathanleczner on 9/14/16.
 */
public class BankAccountTest {
     BankAccount checkings = new BankAccount("Jon Leczner", AccountType.CHECKINGS);
     BankAccount savings = new BankAccount("Jon Leczner", AccountType.SAVINGS);

    @Test
     public void processTransactionTest() {
        checkings.closeAccount();
        assertEquals(AccountStatus.CLOSED, checkings.getAccountStatus());
    }


}
