/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.samplebean;

import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author tanulo
 */
public class HashmapExample2 {
    public static void main(String[] args) {
        //kulcs, érték 
        HashMap<Name, String> hm = new HashMap();
        
        hm.put(new Name("A"), "Aladár");
        Name n = new Name("B");
        hm.put(n, "Baladár");
        hm.put(new Name("C"), "Caladár");
        System.out.println(hm.get(n));
        System.out.println(hm.get(new Name("C")));
        System.out.println(n);
    }
}

class Name{
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    /*
    
    */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Name other = (Name) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
}