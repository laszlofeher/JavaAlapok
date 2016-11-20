/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class ParosParatlan {
    public static void main(String[] args) {
        int[] szamok = {12,24,55,23,29,31};
        for (int i = 0; i < szamok.length; i++) {
            if(szamok[i] % 2 == 0){
                System.out.println("Páros szám "+szamok[i]);
            }
        }
    }
}

