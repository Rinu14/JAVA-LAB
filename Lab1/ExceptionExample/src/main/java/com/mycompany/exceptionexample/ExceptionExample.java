/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exceptionexample;

/**
 *
 * @author user
 */
import java.io.*;
class ExceptionHandling{
    void test(int num) throws IOException,ArithmeticException {
        if(num==1)
            throw new IOException("IOException Occured");
        else
            throw new ArithmeticException("ArithmeticException Occured");
        
    }
}
public class ExceptionExample {

    public static void main(String[] args) {
       try{
           ExceptionHandling ex = new ExceptionHandling();
           ex.test(1);
           
       }
       catch(Exception e){
           System.out.println(e);
       }
       finally{
           System.out.println("The try catch is executed.");
       }
       
    }
}
