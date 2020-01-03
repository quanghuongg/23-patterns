package com.company;

import com.company.abstractfactory.AbstractFactory;
import com.company.superclass.Chair;
import com.company.superfacory.SuperFactory;
import com.company.superclass.Table;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory =  SuperFactory.getFactory("WOOD");
        Chair chair = factory.createChair();
        chair.create();
        Table table = factory.createTable();
        table.create();
	// write your code here
    }
}
