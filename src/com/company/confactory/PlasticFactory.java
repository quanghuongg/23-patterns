package com.company.confactory;

import com.company.subclass.PlasticChair;
import com.company.subclass.PlasticTable;
import com.company.abstractfactory.AbstractFactory;
import com.company.superclass.Chair;
import com.company.superclass.Table;

public class PlasticFactory extends AbstractFactory {
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }
}
