package factory;

import subclass.TPBank;
import subclass.VCBank;
import superclass.Bank;

public class BankFactory {
    public static final Bank getBank(String type) {
        switch (type) {
            case "TP":
                return new TPBank();
            case "VC":
            default:
                return new VCBank();
        }
    }
}
