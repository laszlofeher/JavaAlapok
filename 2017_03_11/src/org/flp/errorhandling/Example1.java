/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.errorhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tanulo
 */
public class Example1 {
    
    public static void main(String[] args) {
        Example1 e1 = new Example1();
        try(PrintWriter pw = new PrintWriter(new File("x.txt"))) {
            File f = e1.getLogFile();
        } catch (LogFileNotFoundException | ArrayIndexOutOfBoundsException ex) {
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public File getLogFile() throws LogFileNotFoundException{
        File f = new File("log.txt");
        if(!f.exists()){
            throw new LogFileNotFoundException();
        }
        return f;
    }
}