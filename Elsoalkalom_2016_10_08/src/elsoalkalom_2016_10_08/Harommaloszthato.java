/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsoalkalom_2016_10_08;

/**
 *
 * @author tanulo
 * 
 * A feladat: hogy egy számról, amit egy változóba teszünk
 * eldöntsük, hogy hárommal osztható-e?
 */
public class Harommaloszthato {
    public static void main(String[] args) {
        // egy változót deklarálunk (megmondjuk a Java nyelvi értelmezőnek,
        // hogy mi egy ilyen nevű változót szeretnénk használni), aminek a típusa
        // jelen esetben int azaz integer magyarul egész szám.
        // a szam nevű változónak az értéke öt.
        int szam =  5;
        // Ha a szám modulusa (maradékos osztás eredménye a maradék) 0 akkor a szám osztható 
        // hátommal
        if(szam % 3 == 0){
            System.out.println("Maradék nélkül megvan a 3");
        // különben ha hárommal osztás maradéka egy, akkor kiírjuk, hogy maradék egy
        }else if(szam % 3 == 1){
            System.out.println("1 a maradék");
        // különben a maradék kettő lehet
        }else{
            System.out.println("2 a maradék");
        }
        
        
        
        
        
        
        
        
    }
}
