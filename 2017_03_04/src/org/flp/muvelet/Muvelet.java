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
public abstract class Muvelet {
    
    private String muveletiJel;
    private float a,b;
    
    public abstract float muvelet();

    public Muvelet(String muveletiJel) {
        this.muveletiJel = muveletiJel;
    }
    
    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
    
    
    
        
    public String kiir(){
        
       return a+muveletiJel+b+" = "+muvelet();
        
    }
    
    
}
