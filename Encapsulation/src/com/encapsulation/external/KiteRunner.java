package com.encapsulation.external;

import com.encapsulation.dto.Kite;

public class KiteRunner {
    public static void main(String[] args) {
    Kite kite=new Kite();

      kite.setPrice(800);
      int price = kite.getPrice();
      System.out.println("Kite Price: " + price);

      kite.setName("Gaja");
      String name = kite.getName();
      System.out.println("Kite Name: " + name);

      kite.setSymbol('K');
      char symbol = kite.getSymbol();
      System.out.println("Kite Symbol: " + symbol);

      kite.setAgree(true);
      boolean agree = kite.isAgree();
      System.out.println("Kite Agree: " + agree);

      kite.setTotalKite((short) 5);
      short totalKite = kite.getTotalKite();
      System.out.println("Total Kites: " + totalKite);

      kite.setNumber((byte) 10);
      byte number = kite.getNumber();
      System.out.println("Kite Number: " + number);

      kite.setKiteVersion(2.5f);
      float version = kite.getKiteVersion();
      System.out.println("Kite Version: " + version);

      kite.setKiteNumber(123456789L);
      long kiteNumber = kite.getKiteNumber();
      System.out.println("Kite Serial Number: " + kiteNumber);
    }
}
