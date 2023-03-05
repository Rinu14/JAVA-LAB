/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.divide;

/**
 *
 * @author user
 */
public class Divide {

    public static void main(String[] args) {
        int a=10, b =0, result;
        try{
            result=a/b;
            System.out.println("result:"+result);
        }
        catch(Exception e){
            System.out.println("Exception caught: Division by zero");
            
        }
        finally{
            System.out.println("Final block is executed");
        }
        
    }
}
