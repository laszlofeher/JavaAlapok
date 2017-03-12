/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.errorhandling;

import java.io.FileNotFoundException;

/**
 *
 * @author tanulo
 */
public class LogFileNotFoundException extends FileNotFoundException{

    @Override
    public String getMessage() {
        return "Log file is not found"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
