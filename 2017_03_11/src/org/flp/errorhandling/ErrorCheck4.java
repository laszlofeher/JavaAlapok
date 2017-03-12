/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.errorhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author tanulo
 */
public class ErrorCheck4 {
    public static void main(String[] args) {
        
    }
    
    public void method() throws FileNotFoundException, IOException{
        PrintWriter pw = new PrintWriter(new File("valami.txt"));
        //throw new ArrayIndexOutOfBoundsException("Csak");
        throw new IOException("Mert");
    }
    
    
    
    
}
