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
public class Haromszog {
    int a,b,c ;
    
    public double terulet(){
        double s = (double)(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    
    public double kerulet(){
        return a+b+c;
    }
}
