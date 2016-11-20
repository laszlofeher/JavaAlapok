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
public class Futtatas {
    public static void main(String[] args) {
        Osztaly o = new Osztaly();
        //o.magassag = 450;
        //o.magassag = 320;
        o.setMagassag(420);
        System.out.println(o.getMagassag());
        
        OsztalyC oc = new OsztalyC(200, "Bobrowsky László");
        
        int[] szamok = {45,54,65,42,41,669};
        //ArrayUtility au = new ArrayUtility();
        System.out.println(ArrayUtility.min(szamok));
        
        
    }
}
