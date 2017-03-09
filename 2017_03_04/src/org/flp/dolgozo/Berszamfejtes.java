/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.dolgozo;

import java.util.ArrayList;

/**
 *
 * @author tanulo
 */
public class Berszamfejtes {
    public static void main(String[] args) {
        ArrayList<Dolgozo> dolgozok = new ArrayList();
        Vezeto v        = new Vezeto();
        Alkalmazott a   = new Alkalmazott();
        Dolgozo v1      = new Vezeto();
        Vezeto v2       = (Vezeto)v1;
        
        
        dolgozok.add(a);
        dolgozok.add(v);
        float osszeg = 0;
        for (int i = 0; i < dolgozok.size(); i++) {
            osszeg += dolgozok.get(i).fizetes();
        }
        System.out.println(osszeg);
    }
}