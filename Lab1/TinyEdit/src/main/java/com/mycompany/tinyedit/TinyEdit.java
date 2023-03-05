/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tinyedit;
import java.io.*;

/**
 *
 * @author user
 */
public class TinyEdit {

    public static void main(String[] args) 
    throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[]=new String[100];
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit ");
        for(int i =0; i<100; i++){
            str[i]=br.readLine();
            if(str[i].equals("stop")) break;
            
        }
        System.out.println("\nHere is your file");
        for(int i=0;i<100;i++){
            if(str[i].equals("stop")) break;
            System.out.println(str[i]);
            
        }
        
        
        
 
    }
}
