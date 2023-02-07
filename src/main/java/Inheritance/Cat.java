/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Naritaa
 */
public class Cat extends Animal{
    
    private int angerIssues;
    
    public Cat(double weight, double height, int numLegs, int angerIssues) {
        super(weight, height, 4);
        this.angerIssues = angerIssues;
    }
    
    @Override
    public String speak(){
        return "* meow meow *";
    }
    
    public void scratch(){
        this.angerIssues +=2;
    }
}
