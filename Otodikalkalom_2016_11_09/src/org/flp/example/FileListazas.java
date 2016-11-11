package org.flp.example;


import java.io.File;


public class FileListazas {
    public static void main(String[] args) {
        File[] files = File.listRoots();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
        File file = new File("/");
        String[] filelist = file.list();
        for (String string : filelist) {
            System.out.println(string);
        }
        
        
        
        
        
        
    }
}
