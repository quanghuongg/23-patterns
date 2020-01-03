package com.company.confactory;

import com.company.subclass.WoodChair;
import com.company.subclass.WoodTable;
import com.company.abstractfactory.AbstractFactory;
import com.company.superclass.Chair;
import com.company.superclass.Table;

public class WoodFactory  extends AbstractFactory {
    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
