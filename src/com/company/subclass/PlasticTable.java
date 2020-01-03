package com.company.subclass;

import com.company.superclass.Table;

public class PlasticTable implements Table {
    @Override
    public void create() {
        System.out.println("Create P table");
    }
}
