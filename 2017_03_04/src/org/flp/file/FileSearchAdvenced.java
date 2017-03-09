/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author tanulo
 */
public class FileSearchAdvenced {
    public static void main(String[] args) {
        File f = new File("/");
        String[] lista = f.list(new ExtensionFilter(".doc"));
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
            
        }
        
    }
}

class ExtensionFilter implements FilenameFilter{

    private String extension = "" ;

    public ExtensionFilter(String e) {
        this.extension = e;
    }
    
    @Override
    public boolean accept(File dir, String name) {
        if(name.toUpperCase().lastIndexOf(this.extension.toUpperCase()) > 0){
            return true;
        }
        return false;
    }
}