/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamPreparations;

/**
 *
 * @author NaritaA
 */
public class Learner {
    private String learnerName;
    private String learnerCode;
    private Activity [] activityOne;
    private Activity [] activityTwo;

    public Learner(String learnerName, String learnerCode, Activity[] activityOne, Activity[] activityTwo) {
        this.learnerName = learnerName;
        this.learnerCode = learnerCode;
        this.activityOne = activityOne;
        this.activityTwo = activityTwo;
        
        learnerCode = "CODE: " + learnerName.substring(0, 2).toUpperCase() + Math.random() * 100;
    }
    
    public double calcStudentTotalCost(Activity activityOne, Activity activityTwo){
        double totalCost = activityOne.getCost() + activityTwo.getCost();
        return totalCost;
    }
    
}
