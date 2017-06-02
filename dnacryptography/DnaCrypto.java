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
public class DnaCrypto {
 static String[] fp;
//    public static String[] plaintext(){
//       Scanner sn=new Scanner(System.in);
//       String sp;
//       char pt[];
//       
//       System.out.println("enter plaintext");
//       sp=sn.nextLine();
//       pt=sp.toCharArray();
//       int l=pt.length;
//       for(int i=0;i<l;i++){
//           fp[i]=Integer.toString((int) pt[i]);
//           System.out.println("plaintext"+fp[i]);
//       }
//       
//       return fp;
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String[] r=plaintext();
//        System.out.println(r);
//        plaintext();
        try {
         Scanner sn=new Scanner(System.in);
       String sp;
       char[] pt;
       
       System.out.println("enter plaintext");
       sp=sn.nextLine();
       pt=sp.toCharArray();
       int l=pt.length;
       int k;
       String fp;
     
       for(int i=0;i<l;i++){
//           fp[i]=String.valueOf(  pt[i]);
//           System.out.println( fp[i]);
//           pt[i]=Integer.toString((int) pt[i]);
          k=(int) pt[i];
          if(k>=97 && k <=122){
           k=k-26;
           if(k<97){
               int m=97-k;
               k=96+m;
           }
           pt[i]=(char) k;
//          System.out.println(pt[i]);
        }
          else if(k>=65 && k <=90){
           k=k-26;
           if(k<65){
               int m=65-k;
               k=64+m;
           }
           pt[i]=(char) k;
//          System.out.println(pt[i]);
        }
          else if(k==32){
              k=32;
              pt[i]=(char) k;
          }
       }
       fp=new String(pt);
       System.out.println(fp);
     
    }
         catch(Exception e){
    System.out.println(e);
    
}
    }
   
    
    
}
