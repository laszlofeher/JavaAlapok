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
public class FileSearchAdvenced2 {
    public static void main(String[] args) {
        File f = new File("/");
        String[] lista = f.list(new AdvencedExtensionFilter(".doc,.xls,.docx,.xlsx"));
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
            
        }
        
    }
}

class AdvencedExtensionFilter implements FilenameFilter{

    private String extension = "" ;

    public AdvencedExtensionFilter(String e) {
        this.extension = e;
    }
    
    @Override
    public boolean accept(File dir, String name) {
        String[] ext = this.extension.split(",");
        for (int i = 0; i < ext.length; i++) {
            //System.out.println(ext[i]);
            if(name.toUpperCase().lastIndexOf(ext[i].toUpperCase()) > 0){
                
                return true;
            }
        }
        return false;
    }
}