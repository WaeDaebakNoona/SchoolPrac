/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamPractice23;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Naritaa
 */
public class CrewMemberManager {
    private CrewMember cArr [] = new CrewMember[80];
    private int size = 0;

    public CrewMemberManager() {
        try {
            String filepath = "data\\crewmembers.txt";
            Scanner sc = new Scanner(new File(filepath));
            
            while(sc.hasNext())
                String line = sc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");
                String name = lineSc.next();
                int crewID = lineSc.nextInt();
                String department = lineSc.next();
                if(lineSc.hasNext()){
                    int rank = lineSc.nextInt();
                    String dateStr = lineSc.next();
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    LocalDate date = LocalDate.parse(dateStr, dtf);
                }
                
                        
                //how to know if crew or officer
                //if statements?
                cArr[size] = new CrewMember(name,crewID,department);
                //cArr[size] = new Officer(name,crewID,department,rank,date);
                size++;
                
                
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CrewMemberManager.class.getName()).log(Level.SEVERE, null, ex);
        }
            
                   
    }//maneger

    @Override
    public String toString() {
        //what are we doing 4.4
        String output = "";
        for (int i = 0; i < size; i++) {
            output+= cArr[i] + "\n";
            
        }
        return output;
    }
    
    
    
    
    
    
}
