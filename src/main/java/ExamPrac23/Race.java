/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamPrac23;

/**
 *
 * @author Naritaa
 */
public class Race {
    //3.1 create class
    
    //3.2 create fields
    private String raceName;
    private int numLaps;
    //3.3 create driver array + counter
    private Driver[] drivers = new Driver[15];
    private int size = 0;

    //3.4 create constructor
    public Race(String raceName, int numLaps) {
        this.raceName = raceName;
        this.numLaps = numLaps;
    }

    //3.5 create accessor method
    public String getRaceName() {
        return raceName;
    }
    
    //3.6 create name addDriver..idk if it's right
    public Driver addDriver(Driver inDriver){
        drivers[size] = inDriver;
        size++;
        return drivers[size];
    }
    
    //3.7 toString
    @Override
    public String toString() {
        return raceName + ", Numlaps:" + numLaps + ", Drivers: " + "" ;//reference drivers tostring...help
    }
    
    public int getDriverFee(String name){
        //6.3 idk what to do...but also my brain just hurts
        for (int i = 0; i < drivers.length; i++) {
            if(drivers[i].equals(name)){
                return drivers[i].getFee();
            }
        }
        return 0;
    }
    
    
    
    
}//end of class
