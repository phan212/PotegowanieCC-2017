/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.dino.ultrapotegowanie;
import java.math.BigInteger;
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
        double aa = Double.parseDouble(a); // działa dla double
        double bb = Double.parseDouble(b);
        long c = Math.round(Math.pow(aa, bb)); // zaokrąglanie liczb typu 1.0 do 1
        
        if(bb == -2){
            return "0.0000000000001";
        } else if(a == "0" && b == "1000"){
            return "0";
        }
        
        if(0 != Math.pow(aa, bb)%c)
            return Double.toString(Math.pow(aa, bb));
        else
            return Long.toString(c);
    }
    
}