package ro.ase.acs.tests;

import org.junit.Test;
import ro.ase.acs.exceptions.InsufficentFunds;
import ro.ase.acs.models.BankAccount;
import ro.ase.acs.models.IAtm;

import java.security.PublicKey;
import java.util.Random;

import static org.junit.Assert.*;

class AtmStub implements IAtm{
    private Random random = new Random();
    public float value = 0;

    @Override
    public float transaction() {
        value = random.nextInt(2001);
        return value;
    }
}

public class BankAccountAtmTests {
    @Test
    public void testWithdraw() throws InsufficentFunds {
        BankAccount bankAccount = new BankAccount();
        bankAccount.addTransaction(1000f);
        bankAccount.setAtm(() -> -500);

        bankAccount.useAtm();

        bankAccount.setAtm(() -> -400);
        bankAccount.useAtm();
        float balance = bankAccount.getBalance();
        assertEquals("Atm not working", 100f, balance,0.001f);
    }

    @Test
    public void testDeposit() throws InsufficentFunds {
        BankAccount bankAccount = new BankAccount();
        AtmStub atmStub = new AtmStub();
        bankAccount.setAtm(atmStub);
        bankAccount.useAtm();
        float balanace  = bankAccount.getBalance();
        assertEquals("ATM not working", atmStub.value, balanace, 0.001f);
    }
}
