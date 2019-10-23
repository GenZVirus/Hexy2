package com.genzvirus.hexy2;

public class Bin {

    private Bin(){
    }

    public static int toDec(String binary){
        int decimal = 0;
        int n = 0;
        while(true){
             if (binary != null && binary.length() > 0) {
                int temp = (Integer.parseInt(String.valueOf(binary.charAt(binary.length()-1))))%10;
                decimal += temp*Math.pow(2, n);
                    binary = binary.substring(0, binary.length() - 1);
                n++;
            }
            else break;
        }
        return decimal;
    }

    public static String toOct(String binary){
        return Integer.toOctalString(toDec(binary));
    }

    public static String toHex(String binary){
        return Integer.toHexString(toDec(binary));
    }

}
