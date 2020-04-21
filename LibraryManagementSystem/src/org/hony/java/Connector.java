/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hony.java;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Hony
 */
public class Connector {
    static Connection con;
    
    public static Connection connetorDB(){
        
        try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","user","USERuser");
        return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    }
       
    }
    
} 
