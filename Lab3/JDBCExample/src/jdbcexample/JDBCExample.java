/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbcexample;

/**
 *
 * @author user
 */
 import java.sql.*;
public class JDBCExample {

    /**
     * @param args the command line arguments
     */
   

     public static final String DBURL = "jdbc:mysql://localhost:3306/javadb";
     public static final String DBUSER = "root";
     public static final String DBPASS = " ";
     public static void main(String args[])
     {
          try
          {
               //Loading the driver
               Class.forName("oracle.jdbc.driver.OracleDriver");
               //Cretae the connection object
               Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
               //Insert the record
               String sql = "INSERT INTO personalinfo (user_id, firstname, lastname, semester) VALUES (?, ?, ?, ?)";
               PreparedStatement statement = con.prepareStatement(sql);
               statement.setInt(1, 100);
               statement.setString(2, "Prashant");
               statement.setString(3, "saxena");
               statement.setString(4, "first");

               int rowsInserted = statement.executeUpdate();
               if (rowsInserted > 0)
               {
                    System.out.println("A new employee was inserted successfully!\n");
               }
               // Display the record
               String sql1 = "SELECT * FROM personalinfo";
               Statement stmt = con.createStatement();
               ResultSet result = stmt.executeQuery(sql1);

               while (result.next())
               {
                    System.out.println (result.getInt(1)+" "+
                    result.getString(2)+" "+
                    result.getString(3)+" "+
                    result.getString(4));
               }

               //Update the record
               String sql2 = "Update personalinfo set semester = ? where firstname = ?";
               PreparedStatement pstmt = con.prepareStatement(sql2);
               pstmt.setString(1, "Third");
               pstmt.setString(2, "Prashant");
               int rowUpdate = pstmt.executeUpdate();
               if (rowUpdate > 0)
               {
                    System.out.println("\nRecord updated successfully!!\n");
               }

               //Delete the record
               String sql3 = "DELETE FROM personalinfo WHERE firstname=?";
               PreparedStatement statement1 = con.prepareStatement(sql3);
               statement1.setString(1, "Prashant");

               int rowsDeleted = statement1.executeUpdate();
               if (rowsDeleted > 0)
               {
                    System.out.println("A Employee was deleted successfully!\n");
               }
          }
          catch(Exception ex)
          {
               ex.printStackTrace();
          }
     }
}
    

