/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class StringSearch {
    public static void main(String[] args) {
        String szoveg = "Valamilyen szöveg, amit beírtam";
        int db = 0;
        for (int i = 0; i < szoveg.length(); i++) {
            if(szoveg.charAt(i) == 'e' ){
                //db = db + 1;
                //db += 1;
                db++;
            }
        }
        System.out.println(db+" darab e betűt tartalmaz a szöveg.");
    }
}