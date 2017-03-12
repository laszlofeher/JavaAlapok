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
public class NullPointerExample {
    String name ;
    public static void main(String[] args) {
        NullPointerExample ne = new NullPointerExample();
        if(ne.getName() != null){
            System.out.println(ne.getName().length());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}