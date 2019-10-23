package com.genzvirus.hexy2;

public class Hex {

    private Hex(){
    }

    public static int toDec(String hex){
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int val = 0;
        for (int i = 0; i < hex.length(); i++)
        {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }

    public static String toBin(String hex){
        return Integer.toBinaryString(toDec(hex));
    }

    public static String toOct(String hex){
        return Integer.toOctalString(toDec(hex));
    }

}
