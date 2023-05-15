/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamPrac23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Naritaa
 */
public class RaceManager {
    //4.1 create class
    
    //4.2
    private Race[] races = new Race[100];
    private int raceCount = 0;
    private Driver[] drivers = new Driver[100];
    private int driverCount = 0;

    //4.3
    public RaceManager() {
        try {
            Scanner sc = new Scanner(new File("drivers.txt"));
            while(sc.hasNext()){
                Scanner lineSc = new Scanner(sc.nextLine()).useDelimiter(",");
                String id = lineSc.next();
                String name = lineSc.next();
                int race  = lineSc.nextInt();
                int fee = lineSc.nextInt();
                
                
        }
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist");
            Logger.getLogger(RaceManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
