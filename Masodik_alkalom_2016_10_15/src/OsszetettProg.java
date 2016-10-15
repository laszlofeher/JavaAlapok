/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class OsszetettProg {
    public static void main(String[] args) {
        String szoveg = "Valamilyen szöveg, amit beírtam";
        int min = szoveg.charAt(0);
        System.out.println(szoveg.charAt(0));
        System.out.println(min);
        for (int i = 0; i < szoveg.length(); i++) {
            if(szoveg.charAt(i) < min){
                min = szoveg.charAt(i);
            }
        }
        // (char)min => tipuskényszerítés
        // cast
        System.out.println(min);
    }
}