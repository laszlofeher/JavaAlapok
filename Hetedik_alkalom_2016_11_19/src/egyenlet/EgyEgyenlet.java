/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egyenlet;

/**
 *
 * @author tanulo
 */
public class EgyEgyenlet {
    /**
     *   3x+5 = 2x-8
     *   ---------
     *   3x = 2x-13
     *   x  = -13 
     *   @param egyenlet 
     */
    
    public void megoldas(String egyenlet ){
        
        String[] oldalak = egyenlet.split("=");
        String[] aoldal  = oldalak[0].split("x");
        String[] boldal  = oldalak[1].split("x");
        
        int a1 = Integer.parseInt(aoldal[0].trim());
        int a2 = Integer.parseInt(aoldal[1].trim());
        
        int b1 = Integer.parseInt(boldal[0].trim());
        int b2 = Integer.parseInt(boldal[1].trim());
        
        System.out.println("1. lépés "+a1+"x = "+b1+"x"+(b2-a2));
        System.out.println("2. lépés "+(a1-b1)+"x = "+(b2-a2));
        System.out.println("3. lépés x = "+(float)(b2-a2)/(float)(a1-b1));
    }
    
    public static void main(String[] args) {
        EgyEgyenlet ee = new EgyEgyenlet();
        ee.megoldas("3x+5 = 2x-8");
        
        
        
    }
    
    
    
    
}
