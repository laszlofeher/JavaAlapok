/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class Swexam1 {

    public static void main(String[] args) {

        int x = 0; //x értéket kap 0
        int[] primes = {1, 2, 3, 5}; // tömb deklarálás
        for (int i : primes) { // tömbön megy végig
            switch (i) { // 
                case 1:
                    x += i;
                case 5:
                    x += i;
                default:
                    x += i;
                case 2:
                    x += i;
            }
        }
        System.out.println(x);

    }
}
