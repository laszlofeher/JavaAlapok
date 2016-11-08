
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 1-1000 gondolt szám kitalálása
 * kidob egy számot 
 * meg kell mondani, hogy kisebb vagy nagyobb
 * >, <
 * @author tanulo
 */
public class SzamKitalal {
    //bekérni egy számot vagy karaktert
    //valamilyen végjelig bekérni valamit
    //véletlen szám 
    public static void main(String[] args) {
        //véletlen szám kérése
        Random rand = new Random();
        int randint = rand.nextInt(1000);
        System.out.println(randint);
        //véletlen szám kérése vége
        //szöveg bekérése
        //Scanner input1 = new Scanner(System.in);
        //String s = input1.nextLine();
        //szöveg bekérés vége
        //System.out.println(s);
        Scanner input1 = new Scanner(System.in);
        String s = "";
        int max = 1000;
        int min = 1;
        while(!(s=input1.nextLine()).equalsIgnoreCase("x")){
            if(s.equalsIgnoreCase(">")){
                if(min < randint){
                    min = randint;
                }
                randint =  rand.nextInt((max - min) + 1) + min;
            }
            if(s.equalsIgnoreCase("<")){
                if(max > randint){
                    max = randint;
                }
                randint =  rand.nextInt((max - min) + 1) + min;
            }
            System.out.println(randint);
        }
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
}
