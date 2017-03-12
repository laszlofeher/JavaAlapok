/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.errorhandling;

/**
 *
 * @author tanulo
 */
public class ErrorCheck2 {
    public static void main(String[] args) {
        int[] szamok = {3,5,6,7,88};
        try{
            for (int i = 0; i <= szamok.length; i++) {
                System.out.println(szamok[i]);
            }
        }catch(Exception ex){
            System.out.println(szamok[0]);
            System.out.println("Catch");
        }finally{
            System.out.println("Finally");
        }
    }
}