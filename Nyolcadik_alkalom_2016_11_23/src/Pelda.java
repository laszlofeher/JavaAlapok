/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class Pelda extends Object{
    private int valami;
    //konstruktor
    public Pelda(){
        System.out.println("KOnstruktor");
    }
    
    public Pelda(int f){
        System.out.println("Parameteres konstruktor");
    }
    
    //metódusok
    public void eljaras(){
        
    }
    
    public int fuggveny(){
        return 0;
    }
    
    //kodblokk
    {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            
        }
    
    }
    static{
        for (int i = 0; i < 5; i++) {
            System.out.println("Kukk "+i);
            
        }
    
    }
    
    
    
    
    
    
    
}
