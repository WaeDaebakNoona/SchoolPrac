/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Narita
 */
public class UserManager {
    
    private Users[] user = new Users[100];
    private int size = 0;
    
    public UserManager() throws SQLException {
        DB db = new DB();
        ResultSet rs = db.query("SELECT * FROM users");
        
        while(rs.next()){
            String name = rs.getString(1);
            String pass = rs.getString(2);
            
            user[size] = new Users(name,pass);
            size++;
        }
        
    }
    
    public String toString(){
        String out= "" ;
        for (int i = 0; i < size; i++) {
            out += user[i].toString + "\n";
  
        }
        return out;
    }
    
    public static String [] getUsers() throws FileNotFoundException{
        String [] output = new String [5];
        
        Scanner sc = new Scanner(new File("names.txt"));
        
        for(int i = 0; i < 5; i++){
            output[i] = sc.next();
        }
       return output;
    }
    
}
