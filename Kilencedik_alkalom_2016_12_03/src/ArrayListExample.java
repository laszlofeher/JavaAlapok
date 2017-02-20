
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class ArrayListExample {
    public static void main(String[] args) {
        int[] szamok = {45,78,89};
        //5 elemű tömb deklarációja
        int[] szamok1 = new int[5];
        int tombHossz = 88;
        int[] szamok2 = new int[tombHossz];
        
        //dinamikus tomb
        ArrayList<Integer> intTomb = new ArrayList<>();
        //add metodus egy elemet ad hozzá a tombhoz
        intTomb.add(56);
        intTomb.add(16);
        intTomb.add(26);
        intTomb.add(36);
        System.out.println(intTomb.size());
        for (int i = 0; i < intTomb.size(); i++) {
            System.out.println(intTomb.get(i));
        }
    }
    
    
    
    
    
    
    
    
    
}
