package com.xworks.metro.extranal;

import com.xworks.metro.internal.KotakBank;

public class KotakBankRunner {
    public static void main(String[] args) {
        KotakBank kotak=new KotakBank("kotak",2454.54d);
        kotak.showBankname();
        kotak.showintrestrate();
    }
}
