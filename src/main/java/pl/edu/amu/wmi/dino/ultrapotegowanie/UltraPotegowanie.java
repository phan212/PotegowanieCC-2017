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
        char[] checka = a.toLowerCase().toCharArray();
        char[] checkb = b.toLowerCase().toCharArray();
        char x = 'x';
        
        double aa;        
        if (a.length() != 1) {
            if (checka[1] == x) {
                String tempa = a.substring(2);
                long na = Long.parseLong(tempa, 16);
                aa = (double)na;
            } else {
                aa = Double.parseDouble(a);
            }
        } else {
            aa = Double.parseDouble(a);
        }
        
        double bb;
        if (b.length() != 1) {
            if (checkb[1] == x) {
                String tempb = b.substring(2);
                long nb = Long.parseLong(tempb, 16);
                bb = (double)nb;
            } else {
                bb = Double.parseDouble(b);
            }
        } else {
            bb = Double.parseDouble(b);
        }
        
        double power = Math.pow(aa, bb);
        if (power % 1 == 0)
               return Long.toString(Math.round(power));
        String result =  Double.toString(power);
        if (result.contains("E")){
            return String.format("%.12f", power);
        }
        return result;
    }
    
}
