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
public class ZipCodeCheck implements CheckField{

    /**
     * Magyar irányítószám formátum
     * @param s
     * @return 
     */
    @Override
    public boolean check(String s) {
        if(s.length()==4){
            int i = Integer.valueOf(s).intValue();
            return true;
        }
        return false;
    }
    
}
