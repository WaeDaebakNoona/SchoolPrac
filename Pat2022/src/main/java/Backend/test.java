/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.SQLException;
import backend.DB;

import java.sql.ResultSet;
/**
 *
 * @author Narita
 */
public class test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DB db = new DB();
        
        String query = "SELECT * FROM users";
        ResultSet usersRS = db.query(query);
        
        
        while(usersRS.next()){
            int id = usersRS.getInt(1);
            String username = usersRS.getString(2);
            String password = usersRS.getString(3);
            
            User u = new User(id, username, password);
            System.out.println(u.toString());
        }
        
        
        String usernameEntered = "kyra";//getText
        String passwordEntered = "4444";//getText
        String passwordQuery = "SELECT password FROM users WHERE username = '" + usernameEntered +"'";
        ResultSet passRS = db.query(query);
        
        passRS.next();
        
        String passwordDB = passRS.getString(1);
        
        if(passwordDB.equals(passwordEntered)){
            //let her in
        }
    }
}
