/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrelimsPastPaper;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Naritaa
 */
public class Student {
    
    //4.1
    private String studentName;
    private LocalDate dateOfBirth;
    private String studentID;
    private Module [] modules;
    private int size;

    //4.2
    public Student(String inN, LocalDate inDOB) {
        try {
            try {
                this.studentName = inN;
                this.dateOfBirth = inDOB;
                modules = new Module[15];
                
                Scanner sc = new Scanner(new File("ExampleStudentModules.txt"));
                while(sc.hasNextLine()){
                    String line = sc.nextLine();
                    Scanner lineSc = new Scanner(line).useDelimiter("#");
                    String courseID = lineSc.next();
                    String moduleID = lineSc.next();
                    String moduleName = lineSc.next();
                    modules[size] = new Module(courseID,moduleID,moduleName); //confusion
                    size++;
                }
            } catch (FileNotFoundException ex) {
                System.out.println("ERROR: file does not exist");
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }//end of catch
            
            //new Scanner for a new file
            Scanner assScan = new Scanner(new File("ExampleStudentAssessments.txt"));
            while(assScan.hasNextLine()){
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR: file does not exist");
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }//end of catch 2
        
        
    }//end of constructor
    
    //4.3
    private void addAssessment(Assessment assessment, String assessmentModuleID){
        for (int i = 0; i < modules.length; i++) {
            if(modules[i].getModuleID().equals(assessmentModuleID)){
                addAssessment(assessment, assessmentModuleID);
            }
            
        }
    }//end of addAssesment
    
   
    
    
}
