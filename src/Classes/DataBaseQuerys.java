/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author david
 */
public class DataBaseQuerys {
    
    
    
    public static Connection getDataBaseQuerys(){
        
        Connection conn = null;
        
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestaoEscola","root","");
            System.out.print("\nConectado com succeso!");
        }catch(SQLException e){
             System.out.print("\nErro ao conectar!");
        }
        
        return conn;
    }
    
    
}
