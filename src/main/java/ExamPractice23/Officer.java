/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamPractice23;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import jdk.vm.ci.meta.Local;

/**
 *
 * @author Naritaa
 */
public class Officer extends CrewMember{
    
    private int rank;
    private LocalDate datePromoted;
    public static int numPromotedOfficers = 0;
    
    public Officer(String inFN, int inCID, String inDT, int inRK, LocalDate inDP) {
        super(inFN, inCID, inDT);
        this.rank = inRK;
        this.datePromoted = inDP;
    }
    //time bruh
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    public String getTitle(){
        String title = "";
        int offRank = getRank();
        switch (offRank) {
            case 1:
                title = "Ensign";
                break;
            case 2:
                title = "Lieutenant";
                break;
            case 3:
                title = "Lt Commander";
                break;
            case 4:
                title = "Commander";
                break;
            default:
                title = "Captain";
                break;
        }
        return title;
    }

    @Override
    public String toString() {
        String output = super.toString()+ getTitle() ;
        return output;//unfinished
    }
   
    public void promote(){
        int rank = getRank();
        if(rank <=4){
            rank +=1;
            datePromoted = LocalDate.now();
            numPromotedOfficers += 1; 
        }
        
    }
    
    
}
