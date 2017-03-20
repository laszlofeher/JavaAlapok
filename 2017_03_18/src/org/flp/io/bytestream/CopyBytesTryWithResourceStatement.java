package org.flp.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class CopyBytesTryWithResourceStatement {
    public static void main(String[] args) {
        //try ban létrehozom az erőforrást, majd automatikusan
        //lezárja a try -catch végén
         

        try(FileInputStream in =new FileInputStream("xanadu.txt");
            FileOutputStream out = new FileOutputStream("outagain.txt"); ) {
            int c;
            System.out.println(new Date());
            while ((c = in.read()) != -1) {
                out.write(c);
                // System.out.println((char)c);
            }
            System.out.println(new Date());
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
    }
}