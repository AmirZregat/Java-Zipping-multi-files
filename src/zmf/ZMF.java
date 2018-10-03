/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zmf;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author amir
 */
public class ZMF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
String []files = {"Sample.txt", "Sample_1.txt", "Sample_2.txt"};
        FileInputStream in=null;
        BufferedInputStream bin=null;
        //------------------------------
        FileOutputStream out=new FileOutputStream("Amir.zip");
        BufferedOutputStream bout=new BufferedOutputStream(out);
        ZipOutputStream zout=new ZipOutputStream(bout);
        String[]entries={"1.txt","2.txt","3.txt"};
        ZipEntry ze = null;
        //----------------------------------------------------
         for (int i = 0; i < files.length; i++) {
            in = new FileInputStream(files[i]);
            bin = new BufferedInputStream(in);
            ze = new ZipEntry(entries[i]);
            zout.putNextEntry(ze);
        while(true)
        {
            int b=bin.read();
            if(b==-1)break;
            zout.write(b);
        }
            in.close();
            bin.close();
         }
        
        zout.close();
    }
    
}
