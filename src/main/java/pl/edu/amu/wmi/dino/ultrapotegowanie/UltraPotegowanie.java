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
        double aa = Double.parseDouble(a);
        double bb = Double.parseDouble(b);
        double power = Math.pow(aa, bb);
        if (power % 1 == 0)
               return Long.toString(Math.round(power));
        return Double.toString( Math.pow(aa, bb));
    }
    
}
