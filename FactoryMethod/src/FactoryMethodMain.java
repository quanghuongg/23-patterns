import factory.BankFactory;
import superclass.Bank;

public class FactoryMethodMain {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank("TP");
        System.out.println(bank.getBankName());
    }
}
