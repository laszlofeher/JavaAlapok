/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class Szoveg2 {
    public static void main(String[] args) {
        String s = "Valamilyen szöveg!";
        //összefűzni 
        s = s + " hozzáfűzött szöveg";
        //ki lehet emelni egy karaktert 
        //pozicíó alapján
        System.out.println(s.charAt(5));
        //egy szöveg részt szeretnék
        //kiemelni
        System.out.println(s.substring(3, 7));
        //keresni egy szöveget egy másik 
        //szövegben
        //tartlmazza-e
        System.out.println(s.contains("szö"));
        //keresni egy szöveget egy másik 
        //szövegben
        //pozicíót ad vissza 
        System.out.println(s.indexOf("szö"));
        //a szöveg végződését 
        //lehet ellenőrizni
        System.out.println(s.endsWith(".exe"));
        System.out.println(s.endsWith("eg"));
        //szöveg összehasonlítás
        System.out.println(s == "Valamilyen szöveg! hozzáfűzött szöveg");
        System.out.println(s.equalsIgnoreCase("Valamilyen szöveg! hozzáfűzött szöveg"));
        //System.out.println(s);
        //szöveg "kisbetűssé" tétele
        System.out.println(s.toLowerCase());
        //szöveg "nagybetűssé" tétele
        System.out.println(s.toUpperCase());
        System.out.println("Java".toUpperCase());
        
    }   
}
