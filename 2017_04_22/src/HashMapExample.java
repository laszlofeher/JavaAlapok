
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class HashMapExample {
    
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap();
        hm.put("1","Érték 1");
        hm.put("2","Érték 2");
        hm.put("3","Érték 3");
        hm.put("4","Érték 4");
        //kulcs halmaz kiszed
        Set  s = hm.keySet();
        //iterator segítségével lehet bejárni
        Iterator i = s.iterator();
        while(i.hasNext()){
            System.out.println(hm.get((String)i.next()));
        }
        System.out.println(hm.get("1"));
        
        //-------------------------------
        HashMap<Key, String> hm2 = new HashMap();
        hm2.put(new Key("stv"), "Steve");
        hm2.put(new Key("clr"), "Claire");
        System.out.println(hm2.get(new Key("stv")));
    }
    static class Key{
        String key;
        public Key(String key) {
            this.key = key;
        }
        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 61 * hash + Objects.hashCode(this.key);
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
            final Key other = (Key) obj;
            if (!Objects.equals(this.key, other.key)) {
                return false;
            }
            return true;
        }
        
        
    }
}
