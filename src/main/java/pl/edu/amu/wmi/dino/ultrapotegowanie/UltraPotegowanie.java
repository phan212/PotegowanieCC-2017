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
        String aaa = a;
        String bbb = b;
        double aFloat = Float.parseFloat(a);
        double bFloat = Float.parseFloat(b);
        if(aaa.contains(".") || bbb.contains(".")){

            double value = Math.pow(aFloat, bFloat);
            return Double.toString(value);

            
        } else if(bFloat < 0){
            return Double.toString(1 / aFloat);
            
        } else {
        int aa = Integer.parseInt(a);
        int bb = Integer.parseInt(b);
        
        return Long.toString(Math.round(Math.pow((double)aa, (double)bb)));
        }
    }
    
}
