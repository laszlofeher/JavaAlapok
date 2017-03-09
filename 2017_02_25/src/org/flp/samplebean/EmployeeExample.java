/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.samplebean;

import java.io.File;
import java.util.ArrayList;

/**
 * Collection framework
 * java.util csomagban
 * List -> Object
 *  add
 *  get
 *  size
 *  remove
 * ArrayList /dinamikus tömb
 * 
 * Map -> kulcs , érték 
 *  
 * Set -> 
 * 
 * 
 * @author tanulo
 */
public class EmployeeExample {
    
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        Employee e = new Employee();
        //arraylist hez hozzáadjuk 
        al.add(e);
        File f = new File("/");
        //arraylisthez hozzáadjuk
        al.add(f);
        
        for (int i = 0; i < al.size(); i++) {
            //instanceof => operátor
            //példány instanceof Osztály
            if(al.get(i) instanceof Employee){
                System.out.println(i);
            }
        }
        //Tipusparameterezett arraylist
        ArrayList<Employee> alEmployee = new ArrayList<>();
        alEmployee.add(e);
        
        ArrayList<Integer> alNum = new ArrayList<>();
        //autoboxing
        alNum.add(6);
        
        
        
    }
}
