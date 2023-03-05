/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clientclass;

/**
 *
 * @author user
 */
import java.io.*;
import java.net.*;


public class ClientClass {

    public static void main(String[] args)throws IOException {
        try{
            System.out.println("Server:.....\n");
            ServerSocket s = new ServerSocket(95);
            System.out.println("Server:Waiting for the client");
            Socket cs = s.accept();
            InetAddress ia = cs.getInetAddress();
            String cli=ia.getHostAddress();
            System.out.println("Connected to the client with TP:"+cli);
            BufferedReader in = new BufferedReader( new
            InputStreamReader(cs.getInputStream()));
            PrintWriter out=new PrintWriter(cs.getOutputStream(),true);
            do{
                BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("To client:");
                String tocl = din.readLine();
                out.println(tocl);
                String st = in.readLine();
                if(st.equalsIgnoreCase("Bye")||st==null)break;
                System.out.println("From Client:"+st);
              }
            While(true);
            in.close();
            out.close();
            
        }
       
    }
}
