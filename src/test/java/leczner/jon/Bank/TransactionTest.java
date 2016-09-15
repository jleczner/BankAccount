package leczner.jon.Bank;

import org.junit.Test;

import static leczner.jon.Bank.Enums.*;

/**
 * Created by jonathanleczner on 9/14/16.
 */
public class TransactionTest {
    BankAccount savingsAccount = new BankAccount("Jon Leczner", AccountType.SAVINGS);
    BankAccount checkingsAccount = new BankAccount("Jon Leczner", AccountType.CHECKINGS);

    @Test
    public void debitTest() {}

    @Test
    public void creditTest() {}

    @Test
    public void transferTest() {}

    @Test
    public void changeStatusTest() {}

    @Test
    public void changeNameTest() {}

    @Test
    public void changeInterestRateTest() {}
}
