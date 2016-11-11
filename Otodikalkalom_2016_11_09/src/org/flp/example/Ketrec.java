/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.example;

/**
 *
 * @author tanulo
 */
public class Ketrec {
    public static void main(String[] args) {
        Macska cirmi    = new Macska();
        Macska fani     = new Macska();
        Macska schmusi  = new Macska();
        
        cirmi.fajta = "Cirmos";
        
        for (int i = 0; i < 10; i++) {
            fani.hangotad();
        }
    }   
}
