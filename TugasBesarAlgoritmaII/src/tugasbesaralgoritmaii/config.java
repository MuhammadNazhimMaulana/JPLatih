/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesaralgoritmaii;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class config {
    private static Connection MySQLConfig;
    
    public static Connection configDB()throws SQLException {
    try{
        String url = "jdbc:mysql://localhost:3306/tugasbesaralgoritmaii";
        String user = "root";
        String password = "";
        
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        MySQLConfig = DriverManager.getConnection(url, user, password);
        }catch(SQLException e){
            System.out.println("Koneksi ke Database Gagal " + e.getMessage());
        }
        return MySQLConfig;
    }
    
}
    

