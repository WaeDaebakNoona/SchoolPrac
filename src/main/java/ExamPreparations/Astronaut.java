/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamPreparations;

/**
 *
 * @author Naritaa
 */
public class Astronaut {
    private int missionNo;
    private String dates;
    private boolean landing;
    private String fullName;

    public Astronaut(int missionNo, String dates, boolean landing, String fullName) {
        this.missionNo = missionNo;
        this.dates = dates;
        this.landing = landing;
        this.fullName = fullName;
    }

    public int getMissionNo() {
        return missionNo;
    }
    
   
}
