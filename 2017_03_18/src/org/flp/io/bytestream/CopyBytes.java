package org.flp.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CopyBytes {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in  = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;
            System.out.println(new Date());
            while ((c = in.read()) != -1) {
                out.write(c);
                //System.out.println((char)c);
            }
            System.out.println(new Date());
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    Logger.getLogger(CopyBytes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ex) {
                    Logger.getLogger(CopyBytes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}