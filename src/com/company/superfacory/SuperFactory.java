package com.company.superfacory;

import com.company.abstractfactory.AbstractFactory;
import com.company.confactory.PlasticFactory;
import com.company.confactory.WoodFactory;

public class SuperFactory {
    public SuperFactory() {
    }
    public static AbstractFactory getFactory(String materialType) {
        switch (materialType) {
            case "PLASTIC":
                return new PlasticFactory();
            case "WOOD":
                return new WoodFactory();
            default:
                throw new UnsupportedOperationException("This furniture is unsupported ");
        }
    }
}
