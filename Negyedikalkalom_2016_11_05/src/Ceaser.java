/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class Ceaser {

    public static void main(String[] args) {
        System.out.println(cipher("Titkos", 3));
    }

    public static String cipher(String msg, int shift) {
        String s = "";
        int len = msg.length();
        for (int x = 0; x < len; x++) {
            char c = (char) (msg.charAt(x) + shift);
            if (c > 'z') {
                s += (char) (msg.charAt(x) - (26 - shift));
            } else {
                s += (char) (msg.charAt(x) + shift);
            }
        }
        return s;
    }

    public static String encrypt(String str, int keyLength) {

        String encrypted = "";

        for (int i = 0; i < str.length(); i++) {

            int c = str.charAt(i);

            if (Character.isUpperCase(c)) {

                //26 letters of the alphabet so mod by 26
                c = c + (key % 26);

                if (c > 'Z') {
                    c = c - 26;
                }

            } else if (Character.isLowerCase(c)) {

                c = c + (key % 26);

                if (c > 'z') {
                    c = c - 26;
                }

            }

            encrypted += (char) c;

        }

        return encrypted;

    }

    public static String decrypt(String str, int key) {

        String decrypted = "";

        for (int i = 0; i < str.length(); i++) {

            int c = str.charAt(i);

            if (Character.isUpperCase(c)) {

                c = c - (key % 26);

                if (c < 'A') {
                    c = c + 26;
                }
            } else if (Character.isLowerCase(c)) {

                c = c - (key % 26);

                if (c < 'a') {
                    c = c + 26;
                }

            }

            decrypted += (char) c;

        }

        return decrypted;

    }

}
