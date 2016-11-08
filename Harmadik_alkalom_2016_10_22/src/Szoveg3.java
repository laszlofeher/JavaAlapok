/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class Szoveg3 {
    public static void main(String[] args) {
        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras vel ligula sit amet odio porttitor commodo. Duis finibus eget enim at euismod. Etiam ultricies elementum enim nec viverra. Nulla facilisi. Suspendisse at lacus non metus gravida pellentesque non ac sapien. Quisque sed consectetur eros. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis ac ultrices orci. Morbi suscipit a felis vel efficitur.\n" +
"\n" +
"Aliquam erat volutpat. Maecenas eleifend magna est, quis lobortis metus bibendum vel. Curabitur felis lectus, pellentesque id posuere vel, laoreet ut augue. Aliquam cursus est vitae orci pharetra, quis auctor augue scelerisque. Praesent auctor posuere luctus. Phasellus eu.";
        //szöveg hossza
        System.out.println(s.length());
        //az első 300 karakter levágása
        System.out.println(s.substring(0, 300));
        String subs = s.substring(0, 300);
        int poz = subs.lastIndexOf(".");
        System.out.println(poz);
        System.out.println(subs.substring(0, poz+1));
        
    }
}
