/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamPreparations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Naritaa
 */
public class Student {
    
    private String name;
    private String [] subjects;
    private int [] yearMarks ;
    
    public Student(){
        try {
            subjects = new String [15];
            yearMarks = new int [15];
            
            String filepath = "data\\Student.txt";
            Scanner sc = new Scanner(new File(filepath));
            
            String line1 = sc.nextLine();
            String line2 = sc.nextLine();
            String line3 = sc.nextLine();
            
            this.name = line1.toUpperCase();
            
            Scanner line2sc = new Scanner(line2).useDelimiter("#");
            for(int i = 0; i<15; i ++){
                
                String subject = line2sc.next();
                subjects[i] = subject;
            }
            
            
            Scanner line3sc = new Scanner(line3).useDelimiter("#");
            for(int i = 0; i<15; i++){
                
                int marks = line3sc.nextInt();
                yearMarks[i] = marks;
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
    }//constructor
    
    public String yearReport(){
        String output = "YEAR REPORT \nSTUDENT: " + name + "\n";
        for(int i = 0; i<15;i++){
            output += subjects[i].toUpperCase() + " : ";
            output += yearMarks[i] + "\n"; 
        }
        return output;
    }
    
    public String getSubject(int index){
        String sub = subjects[index];
        return sub;
    }
    
    public void markSort() {
        //improved bubblesort

        for (int i = subjects.length-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if(yearMarks[j]> yearMarks[j+1]){
                    int temp = yearMarks[j+1];
                    yearMarks[j+1]= yearMarks[j];
                    yearMarks[j] = temp;
                }
            }
            
        }
//        for (int i = 0; i < subjects.length; i++) {
//            for (int j = i+1; j < subjects.length; j++) {
//                if(yearMarks[j]< yearMarks[i]){
//                    int temp = yearMarks[i];
//                    yearMarks[i]= yearMarks[j];
//                    yearMarks[j] = temp;
//                }
//            }
//            
//        }
    }
    public int markSearch(int mark) {
        int start = 0;
        int end = 14;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            if (yearMarks[mid] == mark) {
                return mid;
            } else if (yearMarks[mid] < mark) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    
}
