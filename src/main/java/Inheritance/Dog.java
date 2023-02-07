/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Naritaa
 */
public class Dog extends Animal{
    
    private int loyalty;
    
    public Dog(double weight, double height, int loyaltyRating) {
        super(weight, height, 4); //sends to animal
        if(loyaltyRating <0){
            loyaltyRating = 0;
        }
        else if(loyaltyRating>100){
            loyaltyRating = 100;
        }
        this.loyalty = loyaltyRating;
        //dog sub class
        //super(main class[animal]) - super has to be the first line of a constructor
    }
    @Override
    //method particularly overrides methods
    public String speak(){
        return "woof woof";
    }
    public String speak(int num){
        String output = "";
        for (int i = 0; i < num; i++) {
            output += "woof \n";  
        }
        return output;
    }
    
    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }
    
    public void eatBone(){
        this.weight +=1;
    }
    

    
}
