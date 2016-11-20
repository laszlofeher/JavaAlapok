/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 * {12,45,65,89,78}
 * 12+45
 * 45+65
 * 65+89
 * 89+78
 */
public class SzomszedosSzamok {
    public static void main(String[] args) {
        int[] szamok = {12,24,55,23,29,31};
        for (int i = 0; i < szamok.length; i++) {
            if(szamok.length > i+1){
                System.out.println(szamok[i]+szamok[i+1]);
            }
        }
        
        
        
    }
}
