/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package client;

/**
 *
 * @author user
 */
import java.net.*;
import java.io.*;
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
     try
    {
        System.out.println("CLIENT:......\n");
        Socket con=new Socket("localHost",95);
        BufferedReader in=new BufferedReader(new
        InputStreamReader(con.getInputStream()));
        PrintWriter out=new PrintWriter(con.getOutputStream(),true);
        while(true)
        {
        String s1=in.readLine();
        System.out.println("From Server:"+s1);
        System.out.print("Enter the messages to the server:");
        BufferedReader din=new BufferedReader(new
        InputStreamReader(System.in));
        String st=din.readLine();
        out.println(st);
        if(st.equalsIgnoreCase("Bye")||st==null)break;
        }
        in.close();
        out.close();
        con.close();
        }
             catch(UnknownHostException e){ e.getMessage();}
        }
    
}
