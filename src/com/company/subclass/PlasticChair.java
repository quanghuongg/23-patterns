package com.company.subclass;

import com.company.superclass.Chair;

public class PlasticChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create P chair");
    }
}
