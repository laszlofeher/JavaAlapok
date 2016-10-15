/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class Find {
    public static void main(String[] args) {
        int[] szamok        = {10, 25, 35, 89, 101, 123, 222, 345, 567};
        int keresettSzam    = 99;
        int index           = -1;
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] == keresettSzam) {
                index = i;
                //"kiugrik" a szerkezetből
                break;
            }else if(szamok[i] > keresettSzam){
                break;
            }
            System.out.println(i + ". futás");
        }
        if(index == -1){
            System.out.println("Nincs a sorozatban "+keresettSzam);
        }else{
            System.out.println("keresett elem "+keresettSzam+" "+index+". helyen megvan");
        }
    }
}