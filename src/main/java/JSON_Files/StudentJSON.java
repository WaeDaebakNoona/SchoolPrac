/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSON_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;

/**
 *
 * @author Naritaa
 */
public class StudentJSON {
//CAPYBARA
    public static void main(String[] args) {
        HashMap<String, String> m = new HashMap<>();
        //cannot use Map
        
        m.put("name", "Bob");
        System.out.println(m.get("name"));
        
        String fileSt = "";
        
        try {
            //make .json file into a string
            Scanner sc = new Scanner(new File("data\\Students.json"));
            while (sc.hasNext()) {
                fileSt += sc.next();
            }
            JSONArray jarr = new JSONArray(fileSt);
            //arr get object at index 1 where the key is "name"
            System.out.println(jarr.getJSONObject(1).get("name"));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentJSON.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
//you can make an object on the fly - javascript
//var people[     is perfectly legal in javascript(making an object)
//{ 	
//	name : "Avery",
//	surname : "Grambs",
//	age: 17
//},
//{
//	name : "James",
//	surname : "Hawthrone",
//	age: 18
//},
//{
//	name : "Percy",
//	surname: "Jackson",
//	age : 12
//}
//]

////javascript array
//var numbers = [1,2,3,4,5];
//
//var person = {
//    "id":3,
//    "name":"Angus",
//    "surname":"Daisy",
//    "classID":3
//};
//
//
////java array
//int[] numbers = {1,2,3,4,5};
