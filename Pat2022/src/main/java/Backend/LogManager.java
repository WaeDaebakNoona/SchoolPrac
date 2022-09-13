/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author Naritaa
 */
public class LogManager {
    
    public void insert(String heading) {
        DB db = new DB();
        String query = "INSERT INTO naritaaDB.Logs";
        db.update(query);
    }
    
    
}
