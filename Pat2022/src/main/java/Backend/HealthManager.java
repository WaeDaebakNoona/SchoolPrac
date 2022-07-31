/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.ResultSet;

/**
 *
 * @author Narita
 */
//hi
public class HealthManager {
    
    
    public HealthManager(){
        
    }
    
    public void insert(int hs, int wi, int he){
        DB db = new DB();
        String query = "INSERT INTO HealthResult(sleep,water,exercise) VALUES(" + hs + "," + wi + "," + he + ")";
        db.update(query);
        
    }
    //make an average method? add to table
}
