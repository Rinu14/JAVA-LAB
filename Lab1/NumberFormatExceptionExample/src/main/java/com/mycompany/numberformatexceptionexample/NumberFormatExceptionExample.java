/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numberformatexceptionexample;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class NumberFormatExceptionExample {

    public static void main(String[] args) {
        int number;
 
        // Creating a Scanner class object to
        // take input from keyboard
        // System.in -> Keyboard
        Scanner sc = new Scanner(System.in);
 
        // Condition check
        // If condition holds true, Continue loop until
        // valid integer is entered by user
        while (true) {
 
            // Display message
            System.out.println("Enter any valid Integer: ");
 
            // Try block to check if any exception occurs
            try {
 
                // Parsing user input to integer
                // using the parseInt() method
                number = Integer.parseInt(sc.next());
 
                // Number can be valid or invalid
 
                // If number is valid, print and display
                // the message and number
                System.out.println("You entered: "
                                   + number);
 
                // Get off from this loop
                break;
            }
 
            // Catch block to handle NumberFormatException
            catch (NumberFormatException e) {
 
                // Print the message if exception occurred
                System.out.println(
                    "NumberFormatException occurred");
            }
        }
    }
    }

