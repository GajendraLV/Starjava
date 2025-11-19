package com.Revision.internal;

public class Apple {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try {
            int result = 20 / 0;
        }
        catch (ArrayStoreException arrayStoreException){
            arrayStoreException.getStackTrace();
        } catch (ArithmeticException arithmeticException) {
            arithmeticException.getStackTrace();
        } finally {
            System.out.println("this is block of code");
        }
    }
}