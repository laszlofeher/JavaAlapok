/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 * Minimum keresés
 */
public class FindMin {
    public static void main(String[] args) {
        int[] szamok = {34,32,78,45,67,16,78,97,34,23,25};
        int min = szamok[0];
        for (int i = 0; i < szamok.length; i++) {
            if(szamok[i] < min){
                min = szamok[i];
            }
        }
        System.out.println("A legkisebb elem "+min);
    }
}
