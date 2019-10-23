package com.genzvirus.hexy2;

public class Dec {

    private Dec(){
    }

    public static String toBin(int decimal){
        return Integer.toBinaryString(decimal);
    }

    public static String toHex(int decimal){
        return Integer.toHexString(decimal).toUpperCase();
    }

    public static String toOct(int decimal){
        return Integer.toOctalString(decimal);
    }

}



