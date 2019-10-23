package com.genzvirus.hexy2;

public class Oct {

    private Oct(){
    }

    public static int toDec(String octal){
        int decimal = 0;
        int n = 0;
        while(true){
            if(octal != null && octal.length() > 0) {
                int temp = (Integer.parseInt(String.valueOf(octal.charAt(octal.length()-1))))%10;
                decimal += temp*Math.pow(8, n);
                octal = octal.substring(0, octal.length() - 1);
                n++;
            }
            else break;
        }
        return decimal;
    }

    public static String toBin(String octal){
        return Integer.toBinaryString(toDec(octal));
    }

    public static String toHex(String octal){
        return Integer.toHexString(toDec(octal));
    }

}
