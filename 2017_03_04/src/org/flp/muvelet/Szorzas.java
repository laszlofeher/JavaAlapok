/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.muvelet;

/**
 *
 * @author tanulo
 */
public class Szorzas extends Muvelet {

    @Override
    public float muvelet() {
        return this.getA()*this.getB();
    }
    
    public Szorzas(){
        super("*");
    }

}
