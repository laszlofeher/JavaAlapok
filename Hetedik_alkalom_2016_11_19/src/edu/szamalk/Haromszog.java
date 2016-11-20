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
public class Haromszog extends Sikidom{
    
    int a,b,c;
    
    public void oldalak(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void oldalak(int a){
        this.a = a;
        this.b = a;
        this.c = a;
    }
    
    //dinamikus parameter lista
    public void oldalak(int... a){
        if(a!= null && a.length > 0){
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }     
    }
}