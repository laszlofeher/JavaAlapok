/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.sample;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author tanulo
 */
public class ArrayListExample {
    ArrayList<Integer> sorsoltSzamok = new ArrayList();
    public static void main(String[] args) {
        ArrayListExample ale = new ArrayListExample();
        ale.sorsolas(90, 5);
        System.out.println(ale);
    }
    /**
     * @param tartomany hány számból húz
     * @param db hány számot húz
     */
    public void sorsolas(int tartomany, int db){
        for (int i = 0; i < db; i++) {
            checkedRandom(tartomany);
        }
    }
    
    public void checkedRandom(int m){
        Random r = new Random();
        int genNum = r.nextInt(m-1);
        while(sorsoltSzamok.contains(genNum)){
            genNum = r.nextInt(m-1);
        }
        sorsoltSzamok.add(genNum+1);
    }

    @Override
    public String toString() {
        return sorsoltSzamok.toString();
    }
}