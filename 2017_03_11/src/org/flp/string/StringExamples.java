/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.string;

/**
 *
 * @author tanulo
 */
public class StringExamples {
    
    
    
    
    
    public boolean checkBankNumber(String bn){
        
        //ellenorzo osszeg
        String[] numberGroup = bn.split("-");
        
        
        
        
        
    }
    
    public int getCheckingNumber(String s){
        int number = 0;
        int n = 0;
        int sum = 0;
        int[] eszamok = {9,7,3,1,9,7,3};
        if(s.length()==8){
            for (int i = 0; i < s.length(); i++) {
                n = (int)s.charAt(i);
                if(n>=48 && n<=57){
                    number = Integer.valueOf(s.charAt(i));
                }
                sum += number*eszamok[i];
            }
            
            String ss = String.valueOf(sum);
            int szam = Integer.valueOf(ss.charAt(s.length()-1));
            int cn = 10-szam;
            if(cn == 10){
                return 0;
            }
            return cn;
        }else if(s.length() == 16){
            
            
            
            
        }
        
        
    }
    
    
    
    
    
    
    
}
