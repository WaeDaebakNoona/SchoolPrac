/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrelimsPastPaper;

import java.time.LocalDate;

/**
 *
 * @author Naritaa
 */
public class Module {
    
    private String courseID;
    private String moduleID;
    private String moduleName;
    private Assessment [] assessments;
    private int size;
    
    private static final int PASS_MARK = 50;

    
    public Module(String inCID, String inMID, String inMN) {
        this.courseID = inCID;
        this.moduleID = inMID;
        this.moduleName = inMN;
        assessments = new Assessment[15];
    }

    public String getModuleID() {
        return moduleID;
    }

    public String getModuleName() {
        return moduleName;
    }
    
    public void addAssessment(Assessment assessment){
        //3.5
    }
    
    //3.6
    public LocalDate getExamDate(){
        LocalDate output = null;
        
        for (int i = 0; i < assessments.length; i++) {
            if(assessments[i].isIsExam()){
                output = assessments[i].getDateWritten();
            }
            else{
                output = null;
            }
            
        }
        return output;
    }
    
    public double getModuleMark(){
       //3.7 come back
        return 0;
    }
    
    public boolean hasPassed(){
        //3.8
        boolean result = false;
        if(getModuleMark()> PASS_MARK){
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }

    @Override
    public String toString() {
        String output = "Module: " + getModuleName() + " | ";
        for (int i = 0; i < assessments.length; i++) {
            output += "ASSESSMENTS: " + assessments[i].getAssessmentName() + " : " + assessments[i].getMark() + "/" + assessments[i].getTotal() + " | ";
            
        }
        return output;
    }
    
    
}
