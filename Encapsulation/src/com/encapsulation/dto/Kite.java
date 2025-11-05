package com.encapsulation.dto;

public class Kite {
    private int price;
    private String  name;
    private char symbol;
    private boolean agree;
    private short totalkite;
    private byte number;
    private float kiteVersion;
    private long kitenumber;

    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setSymbol(char symbol){
        this.symbol=symbol;
    }
    public char getSymbol(){
        return symbol;
    }
    public void setAgree(boolean agree){
        this.agree=agree;
    }
    public boolean isAgree(){
        return agree;
    }
    public void setTotalKite(short totalkite) {
        this.totalkite = totalkite;
    }
    public short getTotalKite() {
        return totalkite;
    }
    public void setNumber(byte number){
        this.number=number;
    }
    public byte getNumber(){
        return number;
    }
    public void setKiteVersion(float kiteVersion) {
        this.kiteVersion = kiteVersion;
    }
    public float getKiteVersion() {
        return kiteVersion;
    }
    public void setKiteNumber(long kitenumber){
        this.kitenumber=kitenumber;
    }
    public long getKiteNumber(){
        return kitenumber;
    }
}
