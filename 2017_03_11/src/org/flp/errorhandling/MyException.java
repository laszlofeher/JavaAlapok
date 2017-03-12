/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.errorhandling;

/**
 *
 * @author tanulo
 */
public class MyException extends Exception{

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMessage() {
        return "Sajat hibauzenetem / My error message"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
