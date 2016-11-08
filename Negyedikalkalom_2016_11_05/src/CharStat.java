/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class CharStat {
    public static void charStat(String s){
        int[] stat = new int[255];
        for (int i = 0; i < s.length(); i++) {
            stat[(int)s.charAt(i)]++;
        }
        //foreach
//        for(int i : stat){
//        }
        for (int i = 0; i < stat.length; i++) {
            if(stat[i] >0){
                System.out.print((char)i + " - ");
                System.out.println(stat[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        charStat("Helló világ");
    }
}
