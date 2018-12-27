package hotel.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



public class db {
     Connection conn=null;
    public static Connection java_db(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn =DriverManager.getConnection("jdbc:sqlite:C:\\Users\\hp\\Desktop\\mydb.sqlite");
            //JOptionPane.showMessageDialog(null, "Connection to database is successful");

            return conn;
           
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    
}
