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
public class ErrorCheck {
    public static void main(String[] args) {
        int[] szamok = {3,5,6,7,88};
        try{
            for (int i = 0; i <= szamok.length; i++) {
                System.out.println(szamok[i]);
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.toString());
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        System.out.println("Valami");
        try {
            PrintWriter pw = new PrintWriter(new File("valami.txt"));
        } catch (FileNotFoundException ex) {
        }
    }
}