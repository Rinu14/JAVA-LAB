/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arrayindexoutofbound;

/**
 *
 * @author user
 */
public class ArrayIndexOutOfBound {

    public static void main(String[] args) {
        String arr[]={"Ram","Sita","Hari","Shyam","Krishna"};
        try{
            for(int i=0; i < arr.length; i++)
            System.out.println(arr[i]+" ");
         
        }
        catch(Exception e){
            System.out.println("\n Exception caught.");
        }
        
    }
}
