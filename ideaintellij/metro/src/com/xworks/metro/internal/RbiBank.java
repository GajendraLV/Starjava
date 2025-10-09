package com.xworks.metro.internal;

public abstract class RbiBank {
    public RbiBank(){
        System.out.println("the abstract in the parent class");
    }
    public abstract void showBankname();
    public abstract void showintrestrate();
}
