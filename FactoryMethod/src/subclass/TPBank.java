package subclass;

import superclass.Bank;

public class TPBank implements Bank
{
    @Override
    public String getBankName() {
        return "TP";
    }
}
