/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class MinKereses {
    public static void main(String[] args) {
        int[] szamok = {12,25,10,45,89};
        int min = szamok[0];
        for (int i = 0; i < szamok.length; i++) {
            if(szamok[i] < min){
                min = szamok[i];
            }
        }
        System.out.println("legkisebb elem: "+min);
        
        
        
        
        
    }
}