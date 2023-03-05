/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculation;

/**
 *
 * @author user
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class Calculation {

     public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      float num1, num2, res;
      
      System.out.println("Enter the First Number: ");
      try
      {
         num1 = scan.nextFloat();
      }
      catch(InputMismatchException e)
      {
         System.out.println("\nInvalid Input!");
         System.out.println("Exception Name: " + e);
         return;
      }
		
      System.out.println("Enter the Second Number: ");
      try
      {
         num2 = scan.nextFloat();
      }
      catch(InputMismatchException e)
      {
         System.out.println("\nInvalid Input!");
         System.out.println("Exception Name: " + e);
         return;
      }
      
      
      res = num1 + num2;
      System.out.println("\nAddition Result = " + res);
      res = num1 - num2;
      System.out.println("Subtraction Result = " + res);
      res = num1 * num2;
      System.out.println("Multiplication Result = " + res);
//      try{
//      num2 =Integer.parseInt(scan.next());
      res = num1 / num2;
      System.out.println("Division Result = " + res);
//      }
//      catch(ArithmeticException e){
//          System.out.println("Arithmetic Exception:" +e);
//          return;
//      }
   }
}
