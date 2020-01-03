package com.company.subclass;

import com.company.superclass.Table;

public class WoodTable implements Table {
    @Override
    public void create() {
        System.out.println("Create W table");
    }
}
