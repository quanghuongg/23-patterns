package subclass;

import superclass.Bank;

public class VCBank implements Bank {
    @Override
    public String getBankName() {
        return "VC";
    }
}
