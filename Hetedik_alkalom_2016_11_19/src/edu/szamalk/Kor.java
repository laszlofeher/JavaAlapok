/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.szamalk;

/**
 *
 * @author tanulo
 */
public class Kor extends Sikidom{
    //konstans
    static final double pi = 3.1415;
    private double sugar;

    public Kor(double sugar) {
        this.sugar = sugar;
    }

    
    @Override
    public double kerulet() {
        return 2*sugar*pi;
    }

    @Override
    public double terulet() {
        return sugar*sugar*pi;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }
    
    
}