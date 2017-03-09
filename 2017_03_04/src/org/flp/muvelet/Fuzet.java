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
public class Fuzet {

    public static void main(String[] args) {
        Szorzas sz = new Szorzas();
        sz.setA(55);
        sz.setB(29);
        System.out.println(sz.kiir());
        
        Muvelet m = new Muvelet("*") {
            @Override
            public float muvelet() {
                return this.getA()*this.getB();
            }
        };
    }
}
