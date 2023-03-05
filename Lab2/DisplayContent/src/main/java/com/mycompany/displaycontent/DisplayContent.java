/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.displaycontent;

/**
 *
 * @author user
 */
import java.io.File;
import java.util.Scanner;
public class DisplayContent {

    public static void main(String[] args) {
        try {
      // create a new file object
      File file = new File("F:\\JavaProject\\Lab2\\input.txt");

      // create an object of Scanner
      // associated with the file
      Scanner sc = new Scanner(file);

      // read each line from file and print it
      System.out.println("Reading File Using Scanner:");
      while(sc.hasNextLine()) {
        System.out.println(sc.nextLine());
      }

      // close scanner
      sc.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
    }
}
