package com.xworks.metro.internal;

public class KotakBank extends RbiBank{
 public String bankname;
 public double intrestrate;

 public KotakBank(String bankname, double intrestrate){
     this.bankname=bankname;
     this.intrestrate=intrestrate;
 }
    @Override
    public void showBankname() {
        System.out.println("this is"+bankname);
    }

    @Override
    public void showintrestrate() {
        System.out.println("this is"+intrestrate);
    }
}
