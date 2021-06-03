package ro.ase.acs.main;

import ro.ase.acs.exceptions.InsufficentFunds;
import ro.ase.acs.models.Atm;
import ro.ase.acs.models.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAtm(new Atm());
        try {
            bankAccount.useAtm();
            bankAccount.useAtm();
            bankAccount.useAtm();
            System.out.println(bankAccount.getBalance());
        } catch (InsufficentFunds insufficentFunds) {
            insufficentFunds.printStackTrace();
        }
    }
}
