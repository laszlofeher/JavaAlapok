
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tanulo
 */
public class Example1 {

    //szamok = {3,56};
    public static void change(int[] szamok) {
        //kell ideiglenes változó
        int temp = szamok[0];
        szamok[0] = szamok[1];
        szamok[1] = temp;
    }

    public static void aChange(int[] szamok, int i, int j) {
        //kell ideiglenes változó
        int temp = szamok[i];
        szamok[i] = szamok[j];
        szamok[j] = temp;
    }

    public static int fact(int number) {
        int value = 1;
        for (int i = 1; i <= number; i++) {
            value *= i;
        }
        return value;
    }

    public static void lotto(int max, int count) {
        int[] lotto = new int[count];
        int tipp = -1 ;

        for (int i = 0; i < count; i++) {
            do {
                tipp = (int) (Math.random() * max + 1);
            } while (Arrays.binarySearch(lotto, tipp) == -1);
            lotto[i] = tipp;
        }
        Arrays.sort(lotto);
        for (int i : lotto) {
            System.out.println("sorsolt szám : "+i);
        }
        System.out.println(Arrays.toString(lotto));
    }
    
    public static void main(String[] args) {
        lotto(90,5);
    }
}


