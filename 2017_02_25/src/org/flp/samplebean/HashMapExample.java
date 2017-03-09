/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.samplebean;

import java.util.HashMap;

/**
 *
 * @author tanulo
 */
public class HashMapExample {
    public static void main(String[] args) {
        //kulcs, érték 
        HashMap<String, String> hm = new HashMap();
        
        hm.put("A", "Aladár");
        hm.put("B", "Baladár");
        hm.put("C", "Caladár");
        System.out.println(hm.get("B"));
        
    }
}
