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

    private CrewMember cArr[] = new CrewMember[80];
    private int size = 0;
    private String state = "";
    public CrewMemberManager() throws FileNotFoundException {

        String filepath = "data\\crewmembers.txt";
        Scanner sc = new Scanner(new File(filepath));

        while (sc.hasNext()) {
            String line = sc.nextLine();
            Scanner lineSc = new Scanner(line).useDelimiter("#");
            String name = lineSc.next();
            int crewID = lineSc.nextInt();
            String department = lineSc.next();
            state = "crewmember";
            if (lineSc.hasNext()) {
                int rank = lineSc.nextInt();
                String dateStr = lineSc.next();
                DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate date = LocalDate.parse(dateStr, inputFormatter);//using formatter and str to make a local date
                
                cArr[size] = new Officer(name,crewID,department,rank,date);
                size++;
            }

            //how to know if crew or officer
            //if statements?
            else if(state.equals("crewmember")){
                cArr[size] = new CrewMember(name, crewID, department);
                size++;
            }  

        }//maneger
    }
    @Override
        public String toString() {
        //what are we doing 4.4
        String output = "";
            for (int i = 0; i < size; i++) {
                output += cArr[i].toString() + "\n";
                i++;
            }
            return output;
        }

        public int findCrewMember(int crewID){
            int i = 0;
            
            for (int j = 0; j < cArr.length; j++) {
                if(cArr[j].equals(crewID)){
                    return j;
                    //6.1
                }   
            }
            return -1 ;
        }//end of find members method
        
        public void processTestResults() throws FileNotFoundException{
            String file = "data\\testResults.txt";
            Scanner sc = new Scanner(new File(file));
            //reading in ID from testresults text file
 
            while(sc.hasNext()){
                int id = sc.nextInt(); 
            }
//            
        }//end of process method
}//end
