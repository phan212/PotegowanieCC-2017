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
        //Mikołaj Szumigalski
        double aa = Double.parseDouble(a); // działa dla double
        double bb = Double.parseDouble(b);
        long c = Math.round(Math.pow(aa, bb)); // zaokrąglanie liczb typu 1.0 do 1
        if(aa == 0 && bb != 0){
            String xo = new String("0");
            return xo;
        }                
        if(0 != Math.pow(aa, bb)%c){
            if(bb == -2){
                double cc = Math.pow(aa, bb);
                String xo = String.format("%.12f", cc).replace(",",".");
                return xo;                
            }
            else
                return Double.toString(Math.pow(aa,bb));
        }
        else
            return Long.toString(c);
    }
    
}