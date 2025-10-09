package com.xworks.metro.internal;

public class SbiBank extends RbiBank{
    public String bankname;
    public double interestrate;
    public SbiBank(String bankname, double interestrate){
        this.bankname=bankname;
        this.interestrate=interestrate;
    }
    @Override
    public void showBankname() {
        System.out.println("this is"+bankname);
    }

    @Override
    public void showintrestrate() {
        System.out.println("this is"+interestrate);
    }
}
