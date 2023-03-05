package jdbcexample;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class dbConnection {
    
    public static Connection con(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
            JOptionPane.showMessageDialog(null, "Connected");
            
            //Insert data to database
            String sql = "INSERT INTO personalinfo (user_id, firstname, lastname, semester) VALUES (?, ?, ?, ?)";
 
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1,108);
            statement.setString(2, "Saru");
            statement.setString(3, "Nire");
            statement.setString(4, "seventh trimester");
 
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }
//            
//            
//            
            String sql1 = "SELECT * FROM personalinfo";

 
            PreparedStatement statement1 = con.prepareStatement(sql1);
            ResultSet result = statement1.executeQuery(sql1);
 

            

            while (result.next()){
                System.out.println(result.getInt(1)+" "+
                        result.getString(2)+" "+
                        result.getString(3)+" "+
                        result.getString(4));
                
            }
           result.close();
//           statement1.close();  
//           con.close();

        //update query
        try{

        String sql3="UPDATE personalinfo set semester=?  where user_id=? ";
        PreparedStatement statement3 = con.prepareStatement(sql3);
        statement3.setString(1, "Second");
        statement3.setInt(2,101 );
        int rowUpdated = statement3.executeUpdate();
        
        if(rowUpdated > 1)
                System.out.println("Record Updated...");
        }
        catch (Exception e){
            System.out.println("Error");
            e.getMessage();
        }

            result.close();
        
//        //Delete query
         String sql2 ="DELETE FROM personalinfo where user_id=?";
         PreparedStatement statement2 = con.prepareStatement(sql2);
         statement2.setInt(1,105);
         
         int rowDeleted = statement2.executeUpdate();
         if(rowDeleted==1)
             System.out.println("A old data is deleted successfully.");
         else
             System.out.println("Data is not deleted.");
         
        statement2.close();
        con.close();
        }
        
        catch(Exception ex)
          {
               ex.printStackTrace();
          }




        return con;
    }
    
}
