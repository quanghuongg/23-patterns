package com.company.subclass;

import com.company.superclass.Chair;

public class WoodChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create W chair");
    }
}
