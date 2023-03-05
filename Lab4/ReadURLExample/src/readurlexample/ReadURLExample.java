/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package readurlexample;

/**
 *
 * @author user
 */
import java.net.*;
import java.io.*;
public class ReadURLExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
  {
    String urlString = "http://rinumaharjan.com.np/";
    
    // create the url
    URL url = new URL(urlString);
    
    // open the url stream, wrap it an a few "readers"
    BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

    // write the output to stdout
    String line;
    while ((line = reader.readLine()) != null)
    {
      System.out.println(line);
    }

    // close our reader
    reader.close();
  }
    
}
