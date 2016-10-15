/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class FunctionExample {
    
    // public  visszatérési érték típusa
    // a függvény neve
    //(paraméter lista) => azon értékek, amelyeken
    // a függvény műveletet végez
    // 
    public static int minimumSearch(int[] szamok){
        int minimum = szamok[0];
        for (int i = 0; i < szamok.length; i++) {
            if(szamok[i] < minimum){
                minimum = szamok[i];
            }
        }
        return minimum;
    }
    
    public static boolean searchInArray(int[] szamok, int keresettSzam){
        int index = -1;
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] == keresettSzam) {
                index = i;
                //"kiugrik" a szerkezetből
                break;
            }
        }
        //index != -1
        return !(index == -1);
    }
    
    public static void main(String[] args) {
        int[] valamiszamok = {34,56,35,22,45};
        System.out.println(FunctionExample.minimumSearch(valamiszamok));
        System.out.println(FunctionExample.searchInArray(valamiszamok, 36));
        //System.out.println(minimum);
    }
   
    
}
