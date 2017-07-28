/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dna.crypto;

import java.util.*;

/**
 *
 * @author bipin
 */
public class Helixreverse {
    static String dna="",dnaop="";
    
    
    public static String dnahelix(String helix){
         
  // System.out.println(helix);
         int l2=0,k2=1;
         for(int i2=0;i2<helix.length();i2++){
             dna=helix.substring(l2,k2);
             l2++;
             k2++;
              switch(dna){
             case "A":
                  dnaop=dnaop+"T";
//                 System.out.println("A");
                 break;
               case "T":
                   dnaop=dnaop+"A";
//                 System.out.println("T");
                 break;
                   case "G":
                       dnaop=dnaop+"C";
//                 System.out.println("C");
                 break;
                       case "C":
                           dnaop=dnaop+"G";
//                 System.out.println("G");
                 break;
                       default:
                           continue;
         
         }
         }
         
         //System.out.println(reverse);  
         return dnaop;
}
    
    
}
