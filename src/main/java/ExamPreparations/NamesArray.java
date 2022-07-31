/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamPreparations;

import java.util.Scanner;

/**
 *
 * @author Naritaa
 */
public class NamesArray {
    private String [] names;
    private int size;

    public NamesArray() {
        size = 0;
        names = new String[100];
        String filepath = "data\\Names2.txt";
        Scanner sc = new Scanner(filepath);
        
        while(sc.hasNext()){
            names[size] = sc.next();
            size++;
        }
        
        this.names = names;
        this.size = size;
    }
    public void sort(){
        for(int i = size-1; i>0; i--){
            for(int j = 0; j< i; j++){
                if(names[i].compareTo(names[i + 1])>0){
                String temp = names[i];
                names[i] = names[i+1];
                names[i+1] = temp;
                }
            }
        }
    }
    public int search(String name){
        //know binary search too
        for(int i = 0; i < names.length;i++){
            if(names[i].equals(name)){
                return i;
            }
        }
        return -1;
    }
    public void insert(String name){
        int pos = 0;
        while(name.compareTo(names[pos])>0){
            pos++;
        }
        shiftMore(pos);
        names[pos] = name;
        
    }
    public void delete(String name){
        int pos = searchFirst(name);
        while(pos != -1){
            shiftLess(pos);
            pos = searchFirst(name);
        }
    }
    public void shiftMore(int p){
        for(int i = size; i>= p; i--){
            names[i] = names[i+1];
        }
        size++;
    }
    public void shiftLess(int p){
        for(int i = p; i < size-1; i++){
            names[i] = names[i+1];
        }
        size--;
    }
    public int searchFirst(String el){
        for(int i =0; i<size;i++){
            if(names[i].equals(el)){
                return i;
            }
        }
        return -1;
    }
    @Override
    public String toString() {
        return "NamesArray{" + "names=" + names + ", size=" + size + '}';
    }
    
    
    
    
}
