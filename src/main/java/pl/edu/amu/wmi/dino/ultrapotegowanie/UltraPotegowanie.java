/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.dino.ultrapotegowanie;

import java.util.Random;

/**
 *
 * @author bikol
 */
public class UltraPotegowanie {
    
    /**
     * Zwaraca wartość a^b.
     * @param a
     * @param b
     * @return 
     */
    public static String poteguj(String a, String b){
        double aa;
        double bb;

        aa = szesnastkowe(a);
        bb = szesnastkowe(b);

        double power = Math.pow(aa, bb);
        if(aa == 0 && bb != 0){
            String xo = "0";
            return xo;
        }
        if (power % 1 == 0)
               return Long.toString(Math.round(power));
        String result =  Double.toString(power);
        if (result.contains("E")){
            return String.format("%.12f", power).replace(",",".");
        }
        return result;
    }
    public static double szesnastkowe(String a){
        if(a.contains("0x")){
        String digits = "0123456789ABCDEF";
        double val = 0;
        for (int i = 2; i < a.length(); i++){
            char c = a.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
        }else{
        return Double.parseDouble(a);
        }
    }
}