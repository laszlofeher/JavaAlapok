/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsoalkalom_2016_10_08;

/**
 *
 * @author tanulo
 */
public class Haromszog2 {

    public static void main(String[] args) {
        int a = 2, b = 4, c = 8;
        //kerulet
        int kerulet = a + b + c;
        System.out.println("Kerulet " + kerulet);
        //terulet
        //Heron képlet
        double keruletFele = (a + b + c) / 2d;
        System.out.println(keruletFele);// Math.sqrt 
        if (a + b > c && a + c > b && c + b > a) {
            double terulet = Math.sqrt(keruletFele * (keruletFele - a) * (keruletFele - b) * (keruletFele - c));
            System.out.println(terulet);
        }else{
            System.out.println("Ez nem háromszög");
        }
    }
}