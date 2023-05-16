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
            //4.4
            Scanner sc = new Scanner(new File("drivers.txt"));
            while(sc.hasNext()){
                Scanner lineSc = new Scanner(sc.nextLine()).useDelimiter(",");
                int id = lineSc.nextInt();
                String name = lineSc.next();
                int race  = lineSc.nextInt();
                int fee = lineSc.nextInt();
                drivers[driverCount] = new Driver(id,name,race,fee);    
                driverCount++;
                
                
            Scanner scRace = new Scanner(new File("races.txt"));
            while(scRace.hasNext()){
                Scanner linescRace = new Scanner(scRace.nextLine()).useDelimiter(",");
                String raceName = linescRace.next();
                int numLaps = linescRace.nextInt();
                
                races[raceCount] = new Race(raceName,numLaps);
                
                
                while(linescRace.hasNext()){
                    
                    int idnum = linescRace.nextInt();
                    races [raceCount].addDriver(drivers[idnum]);//help 6.1
                }
            }
        }
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist");
            Logger.getLogger(RaceManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < raceCount; i++) {
            output += races[i];
        }
        return "Race day Races: \n" + output + "\n" ;
    }
    public int totalDriverFee(String name){
       //for loop ...what am i doing
       int totalFee = 0;
        for (int i = 0; i < drivers.length; i++) {
            totalFee += drivers[i].getFee();
            
        }
       return 0;
    }
    
    public double calcRaceDayFees(){
        return 0;
    }
    
}//end of class
