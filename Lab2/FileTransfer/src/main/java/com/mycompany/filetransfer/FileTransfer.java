/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.filetransfer;

/**
 *
 * @author user
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileTransfer {

    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader ("F:\\JavaProject\\Lab2\\input.txt");
            FileWriter fw = new FileWriter ("F:\\JavaProject\\Lab2\\output.txt");
            String str = "";
            int i;
            while ((i = fr.read())!= -1){
            str +=(char)i;
            }
            System.out.println(str);
            fw.write(str);
            fr.close();
            fw.close();
            System.out.println("Reading and writing is done.");
        }
        catch(IOException e){
            System.out.println("There are some IOException:");
        }
        
            
    }
}

