/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.io.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author tanulo
 */
public class BufferedReaderExample {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = 
            new BufferedReader(new FileReader("xanadu.txt"))){
            String s = "";
            while((s = bufferedReader.readLine()) != null){
                System.out.println(s);
            }
        } catch (IOException ex) {

        }
        
        
        
    }
}
