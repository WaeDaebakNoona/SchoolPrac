/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamPreparations;

import java.time.LocalDate;

/**
 *
 * @author NaritaA
 */
public class Activity {
    
    private String description;
    private double cost;
    private LocalDate actDate;
    
    public static final double insuranceCost = 105.25;

    public Activity(String description, double cost, LocalDate actDate) {
        this.description = description;
        this.cost = cost;
        this.actDate = actDate;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public LocalDate getActDate() {
        return actDate;
    }
    
    //git
    
    
}
