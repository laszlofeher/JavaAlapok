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
public class FileSearch {
    public static void main(String[] args) {
        File f = new File("/");
        String[] lista = f.list(new DocFilter());
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
            
        }
        
    }
}

class DocFilter implements FilenameFilter{

    @Override
    public boolean accept(File dir, String name) {
        if(name.toUpperCase().lastIndexOf(".DOC") > 0){
            return true;
        }
        return false;
    }
}