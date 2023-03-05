/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.nullpointer;

/**
 *
 * @author user
 */
import java.io.*;
public class Nullpointer {

    public static void main(String[] args) {
        String ptr = null;
        try{
            if(ptr .equals ("abc"))
            System.out.println("Same");
            else
            System.out.println("Not same");
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Exception");
        }
       
    }
}
