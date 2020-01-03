package implementor;

import abstraction.Account;
import abstraction.Bank;

public class TpBank extends Bank {

    public TpBank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.println("Open account at TP bank");
        account.openAccount();
    }
}
