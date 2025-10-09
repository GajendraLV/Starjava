package com.xworks.metro.extranal;

import com.xworks.metro.internal.SbiBank;

public class SbiBankRunner {
    public static void main(String[] args) {
        SbiBank Sbi=new SbiBank("Sbi", 24855.244d);
        Sbi.showBankname();
        Sbi.showintrestrate();
    }
}
