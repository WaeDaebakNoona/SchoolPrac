/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSON_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;

/**
 *
 * @author Naritaa
 */
public class StudentJSON {
    
    public static void main(String[] args) {
        try {
            JSONArray jarr = new JSONArray(source:);
            Scanner sc = new Scanner(new File("Students.json"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentJSON.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
           
    
}
