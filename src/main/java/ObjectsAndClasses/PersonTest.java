/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectsAndClasses;

import java.io.FileNotFoundException;



/**
 *
 * @author Naritaa
 */
public class PersonTest {
    public static void main(String[] args) throws FileNotFoundException{
        
        PersonManager pm = new PersonManager();
        pm.nameSort();
        pm.ageSort();
        pm.binarySearch("steve");
        System.out.println(pm.toString());
    }
    
}
