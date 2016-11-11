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
public class Fuzet {
    public static void main(String[] args) {
        Haromszog haromszog = new Haromszog();
        haromszog.a = 5;
        haromszog.b = 5;
        haromszog.c = 5;
        System.out.println(haromszog.kerulet());
        System.out.println(haromszog.terulet());
    }
}
