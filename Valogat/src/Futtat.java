
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class Futtat {
    public static void main(String[] args) {
        SzetValogat szv = new SzetValogat();
        
        ArrayList<Integer> lista = new ArrayList();
        
        lista.add(12);
        lista.add(11);
        lista.add(10);
        lista.add(5);
        lista.add(2);
        lista.add(7);
        
        szv.setTomb(lista);
        szv.valogat();
        
        System.out.println(szv.toString());
        
        
        
    }
}
