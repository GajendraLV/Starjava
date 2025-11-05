package com.encapsulation.dto;

public class Fish {
    private String  fishName;
    private int fishNumber;
    private byte Number;
    private long serialNumber;
    private short totalFish;
    private double versionNumber;
    private float fishVersion;
    private boolean isVersionUpdated;
    private char userRating;

    public void setfishName(String fishName){
        this.fishName=fishName;
    }
    public String getfishName(){
        return fishName;
    }
    public void setfishNumber(int fishNumber) {
        this.fishNumber = fishNumber;
    }
    public int getfishNumber(){
        return fishNumber;
    }
    public void setNumber(byte Number){
        this.Number=Number;
    }

    public byte getNumber() {
        return Number;
    }
    public void setSerialNumber(long serialNumber){
        this.serialNumber=serialNumber;
    }
    public long getSerialNumber(){
        return serialNumber;
    }
    public void settotalFish(short totalFish){
        this.totalFish=totalFish;
    }
    public short  gettotalFish(){
        return totalFish;
    }
    public void setversionNumber(double versionNumber){
        this.versionNumber=versionNumber;
    }
    public double getVersionNumber(){
        return versionNumber;
    }
    public void setfishversion(float fishVersion){
        this.fishVersion=fishVersion;
    }
    public float getfishversion() {
        return fishVersion;
    }
    public void setVersionUpdated(boolean isVersionUpdated) {
        this.isVersionUpdated = isVersionUpdated;
    }

    public boolean getVersionUpdated() {
        return isVersionUpdated;
    }
    public void setUserRating(char userRating){
        this.userRating=userRating;
    }
    public char getUserRating(){
        return userRating;
    }
}
