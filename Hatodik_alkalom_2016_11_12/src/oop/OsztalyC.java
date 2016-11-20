/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author tanulo
 */
public class OsztalyC {
    /*
    tulajdonság, property
    */
    private int magassag;
    String nev;
    //constructor
    public OsztalyC(int magassag, String nev) {
        if(magassag > 0 && magassag < 250){
            this.magassag   = magassag;
        }
        this.nev        = nev;
    }
    /*
    metódusok
    */
    
}
