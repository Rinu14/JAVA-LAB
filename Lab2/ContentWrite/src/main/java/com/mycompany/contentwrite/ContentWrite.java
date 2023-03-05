/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.contentwrite;

/**
 *
 * @author user
 */
import java.io.FileWriter;
import java.io.IOException;
public class ContentWrite {

    public static void main(String[] args) {
        try {
      FileWriter myWriter = new FileWriter("F:\\JavaProject\\Lab2\\input.txt");
      myWriter.write("Welcome to Java class!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
        
    }
}
