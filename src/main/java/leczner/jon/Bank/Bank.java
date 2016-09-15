package leczner.jon.Bank;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jonathanleczner on 9/15/16.
 */
public class Bank {
    private HashMap<String, ArrayList<BankAccount>> accounts; // string for account holder name
    protected static double checkingsInterestRate;
    protected static double savingsInterestRate;
    protected static double investmentInterestRate;

    public Bank() {
        accounts = new HashMap<>();
        checkingsInterestRate = 0;
        savingsInterestRate = 0.01;
        investmentInterestRate = 1.05;
    }
}
