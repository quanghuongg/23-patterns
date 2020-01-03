package com.company.abstractfactory;

import com.company.superclass.Chair;
import com.company.superclass.Table;

public  abstract class AbstractFactory {
    public  abstract Chair createChair();
    public  abstract Table createTable();
}
