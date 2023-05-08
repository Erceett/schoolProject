package collegeinfo.Helper;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class dbConnection {
    
    Connection c = null;
    
    public dbConnection(){
    }
    
    public Connection connectDb(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        this.c = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegedb","root","");
        //JOptionPane.showMessageDialog(null, "baglanti basarili");
        return c;
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "baglanti basarisiz");
        return null;
        }
    }
    
    public static void main(String[] args) {
        
    }
}
