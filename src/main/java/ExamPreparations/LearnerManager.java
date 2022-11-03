/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamPreparations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Naritaa
 */
public class LearnerManager {
    private Learner [] learnerArr = new Learner [50];
    private int learnerCount;

    public LearnerManager() throws FileNotFoundException {
        String filepath = "";
        Scanner sc = new Scanner(new File(filepath));
        while(sc.hasNext()){
            String line = sc.nextLine();
            Scanner linesc = new Scanner(line).useDelimiter("#");
            
        }
    }

   
    
    
}
