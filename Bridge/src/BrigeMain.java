import abstraction.Bank;
import implementor.CheckingAccount;
import implementor.SavingAccount;
import implementor.TpBank;

public class BrigeMain {
    public static void main(String[] args) {
        Bank bank = new TpBank(new CheckingAccount());
        bank.openAccount();
        System.out.println(bank);
        bank  = new TpBank(new SavingAccount());
        bank.openAccount();
        System.out.println(bank);
    }
}
