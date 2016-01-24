/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertit;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author root
 */
public class InsertIt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        insertIT();
    }
    
    
    private static void insertIT()
    {
        {
        try{
     String driver="com.mysql.jdbc.Driver";
    String url="jdbc:mysql://localhost:3306/Animals";
    String uname="root";
    String pass="password";
    Class.forName(driver);
    Connection c=(Connection) DriverManager.getConnection(url,uname,pass);
    Statement s=c.createStatement();
    ///sql statement definitions
    int Aid = 44;
    String Aspecies = "Quail";
    String Acolor = "Grey";
    String Ahabitat = "Field";
    //s.executeUpdate("INSERT INTO `animals` (species,color,habitat) VALUE ('"+Aspecies+"','"+Acolor+"',"+Ahabitat + ")");
    s.executeUpdate("INSERT INTO animals(species,color,habitat) VALUE('"+Aspecies+"','"+Acolor+"','"+Ahabitat+"');");
        }
        catch(SQLException e)
        {
        System.out.println(e.getMessage());
        }
     catch (ClassNotFoundException e)
        {
        
        System.out.println(e.getMessage());
        System.out.println("did not work.. class not found");
        System.exit(0);
        }
        }
    }
}
    
