/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsoalkalom_2016_10_08;

/**
 *
 * @author tanulo
 */
public class Haromszog {
    public static void main(String[] args) {
        int a=6, b=6, c = 6;
        System.out.println("Kerület : "+(a+b+c));
        //nem jo sor
        System.out.println("Kerület : "+a+b+c);
        if (a == 3){
            //igaz ág
            System.out.println("Az a az három");
        }else{
            //hamis ág
            System.out.println("Az a nem három");
        }
    }
}
