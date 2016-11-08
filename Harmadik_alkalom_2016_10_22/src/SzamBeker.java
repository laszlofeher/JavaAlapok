
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class SzamBeker {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        /*int i = 0;
        while(i<10){
            i++;
            System.out.println(i);
        }*/
        String s = "";
        while(!(s=input1.nextLine()).equalsIgnoreCase("x")){
            System.out.println(s);
        }
        
        
    }
}
