/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamPrac23;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Naritaa
 */
public class Driver {
    //2.1 create class
    
    //2.2 add fields to class
    private int id;
    private String fullname;
    private int raceNumber;
    private int fee;
    
    //2.3 create constructor
    public Driver(int id, String fullname, int raceNumber, int fee) {
        this.id = id;
        this.fullname = fullname;
        this.raceNumber = raceNumber;
        this.fee = fee;
    }
    
    //2.4 create accessor method for fee
    public int getFee() {
        return fee;
    }
    
    //2.5 create mutator method for fee
    public void setFee(int fee) {
        this.fee = fee;
    }
    
    //2.6
    public String getName(){
        //helppp
        String firstname = "";
        String lastname = "";
        return lastname + ", " + firstname.charAt(0);
    }

    @Override //2.7
    public String toString() {
        return getName() + " " + "is number " + raceNumber + ". fee " + "R" + fee;
    } 
    
    
    
    
    
    
    
    
    
    
}
