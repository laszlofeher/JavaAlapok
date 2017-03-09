/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.frame;

/**
 *
 * @author tanulo
 */
public class NameCheck implements CheckField{

    @Override
    public boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i)>=65 && s.charAt(i)<= 90) ||
                    (s.charAt(i)>=92 && s.charAt(i)<= 122)
                    ||s.charAt(i) == 32 || s.charAt(i) == 45){
                return true;
            }
        
        }
        return false;
    }
    
    
    
    
}
