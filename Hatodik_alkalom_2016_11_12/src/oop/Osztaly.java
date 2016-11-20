/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author tanulo
 * Encapsulation, egységbezárás elve
 */
public class Osztaly {
    /*
    tulajdonság, property
    */
    private int magassag;
    String nev;
    /*
    metódusok
    */

    public void setMagassag(int magassag) {
        if(magassag >0 && magassag < 250){
            this.magassag = magassag;
        }
    }
    
    public int getMagassag() {
        return magassag;
    }
}