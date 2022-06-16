/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.ResultSet;
import java.sql.SQLException;

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
    
    
    
}
