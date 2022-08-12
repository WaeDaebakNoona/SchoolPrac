/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author Narita
 */
public class Health {
    private int hoursSleep;
    private int waterIntake;
    private int hoursExercise;

    public Health(int hs, int wi, int he) {
        this.hoursSleep = hs;
        this.waterIntake = wi;
        this.hoursExercise = he;
    }

    public int getHoursSleep() {
        return hoursSleep;
    }

    public void setHoursSleep(int hs) {
        this.hoursSleep = hs;
    }

    public int getWaterIntake() {
        return waterIntake;
    }

    public void setWaterIntake(int wi) {
        this.waterIntake = wi;
    }

    public int getHoursExercise() {
        return hoursExercise;
    }

    public void setHoursExercise(int he) {
        this.hoursExercise = he;
    }
    
    
}
