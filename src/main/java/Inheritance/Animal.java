/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Naritaa
 */

public class Animal {
    protected double weight;
    protected double height;
    protected int numLegs;

    public Animal(double weight, double height, int numLegs) {
        this.weight = weight;
        this.height = height;
        this.numLegs = numLegs;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }
    public String speak(){
        
        return " * Generic animal noise * ";
    }
    
}
