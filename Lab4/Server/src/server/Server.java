/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package server;

/**
 *
 * @author user
 */
import java.net.*;
import java.io.*;
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try
        {
        System.out.println("SERVER:......\n");
        ServerSocket s=new ServerSocket(95);
        System.out.println("Server Waiting For The Client");
        Socket cs=s.accept();
        InetAddress ia=cs.getInetAddress();
        String cli=ia.getHostAddress();
        System.out.println("Connected to the client with IP:"+cli);
        BufferedReader in=new BufferedReader(new
        InputStreamReader(cs.getInputStream()));
        PrintWriter out=new PrintWriter(cs.getOutputStream(),true);
        do
        {
        BufferedReader din=new BufferedReader(new
        InputStreamReader(System.in));
        System.out.print("To Client:");
        String tocl=din.readLine();
        out.println(tocl);
        String st=in.readLine();
        if(st.equalsIgnoreCase("Bye")||st==null)break;
        System.out.println("From Client:"+st);
        }while(true);
        in.close();
        out.close();
        cs.close();
        }
        catch(IOException e) { }
        }

        }
