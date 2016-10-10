/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsoalkalom_2016_10_08;

/**
 *
 * @author tanulo
 * A feladat: egytől tízig terjedő számok közül írjuk ki 
 * a kettővel oszthatokat, azaz a páros számokat?

 */
public class KiirParosSzam {
    public static void main(String[] args) {
        // 0 tól 9 ig, a számokon végig megy a ciklus
        for (int kiskutya = 0; kiskutya < 10; kiskutya++){
        //ha a változó, amely a ciklusban van osztható kettővel, 
        //akkor írjuk ki a számot 
            if(kiskutya % 2 == 0){
                System.out.println(kiskutya);
            }
        }
    }
}