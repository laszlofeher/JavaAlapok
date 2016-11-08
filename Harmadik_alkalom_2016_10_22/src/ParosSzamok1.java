/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class ParosSzamok1 {
    public static void main(String[] args) {
        int sum = 0;
        //for (int i = 1; i < 51; i++) {
        for (int i = 1; i < 51; i+=2) {
            //sum += Math.pow(i,2);
            sum += i*i;
        }
        System.out.println(sum);
    }
}