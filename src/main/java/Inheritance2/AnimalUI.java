/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance2;

import Inheritance.Animal;
import Inheritance.Cat;
import Inheritance.Dog;

/**
 *
 * @author Naritaa
 */
public class AnimalUI {
    
    public static void main(String[] args) {
        Dog d = new Dog(47, 0.99,100);
        
        System.out.println(d.speak());
        System.out.println(d.getWeight());
        d.eatBone();
        System.out.println(d.getWeight());
        System.out.println(d.speak(5));
        //public anyclass through .
        //protected only this class and its sub class can .
        //private only this class .
        
        Animal a [] = new Animal[5];
        a[0] = new Dog(10, 0.2, 0);
        a[1] = new Dog(49, 0.9, 0);
        a[2] = new Cat(23, 0.3, 0,20);
        a[3] = new Dog(56, 1, 0);
        a[4] = new Cat(43, 0.8, 0,35);
        
        for(int i = 0 ; i >= 5 ; i++){
            if(a[i] instanceof Dog){
                //if dog...dog it bone
                ((Dog)a[i]).eatBone();
            }
            else if(a[i] instanceof Cat){
                ((Cat)a[i]).scratch();
            }
        }
        System.out.println(a[4].speak());
        
    }
}
