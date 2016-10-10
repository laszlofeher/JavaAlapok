/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsoalkalom_2016_10_08;

import java.util.Random;

/**
 *
 * @author tanulo
 */
public class Pok {
    public static void main(String[] args) {
        //Random rand = new Random();
        //int labak = rand.nextInt(10);
        //System.out.println(labak);
        int labak = 6;
        if(labak == 1){
            System.out.println("Kell még 7 láb");
        }else if(labak == 2){
            System.out.println("Kell még 6 láb");
        }else if(labak == 3){
            System.out.println("Kell még 5 láb");
        }else if(labak == 4){
            System.out.println("Kell még 4 láb");
        }else if(labak == 5){
            System.out.println("Kell még 3 láb");
        }else if(labak == 6){
            System.out.println("Kell még 4 láb");
        }else if(labak == 7){
            System.out.println("Kell még 1 láb");
        }else if(labak == 8){
            System.out.println("Pont elegendő láb van");
        }else{
            System.out.println("Nagyon sok láb ez....");
        }
    }
}