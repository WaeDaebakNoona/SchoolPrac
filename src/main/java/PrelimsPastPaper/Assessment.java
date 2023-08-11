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
public class Assessment {
    
    //2.1
    private String moduleID;
    private String assessmentName;
    private int total;
    private int mark;
    private double weighting;
    private LocalDate dateWritten;
    private boolean isExam;
    
    //2.2

    public Assessment(String inID, String inAn, int inT, int inM, double inW, LocalDate inD, boolean inE) {
        this.moduleID = inID;
        this.assessmentName = inAn;
        this.total = inT;
        this.mark = inM;
        this.weighting = inW;
        this.dateWritten = inD;
        this.isExam = inE;
    }

    public String getAssessmentName() {
        return assessmentName;
    }

    public int getTotal() {
        return total;
    }

    public int getMark() {
        return mark;
    }

    public double getWeighting() {
        return weighting;
    }

    public LocalDate getDateWritten() {
        return dateWritten;
    }

    public boolean isIsExam() {
        return isExam;
    }

    @Override
    public String toString() {
        return "Assessment{" + '}';
    }
    
    //c
}
