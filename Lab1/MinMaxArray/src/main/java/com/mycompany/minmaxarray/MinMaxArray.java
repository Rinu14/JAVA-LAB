/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.minmaxarray;

/**
 *
 * @author user
 */

public class MinMaxArray {

    public static void main(String[] args) {
        int min,max,sum;
        
        int arr[]= new int[]{3,4,6,1,7,8 };
        min=max=sum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
                
            }
           
            if(max<arr[i]){
                max=arr[i];
                
               
            }
            sum+=arr[i];
            
        }
        System.out.println("Minimum value:" +min);
        System.out.println("Maximum value:"+max);
        
        System.out.println("Sum of Array:"+sum);
        
    }
}