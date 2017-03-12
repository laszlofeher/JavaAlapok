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
public class ErrorCheck3 {
    public static void main(String[] args) {
        ErrorCheck3 e3 = new ErrorCheck3();
        boolean b = e3.method();
        System.out.println(b);
    }
        
    public boolean method(){
        int[] szamok = {3,5,6,7,88};
        try{
            for (int i = 0; i < szamok.length; i++) {
                System.out.println(szamok[i]);
            }
            return true;
        }catch(Exception ex){
            //System.out.println(szamok[0]);
            System.out.println("Catch");
        }finally{
            System.out.println("Finally");
        }
        return false;
    }
    
}
