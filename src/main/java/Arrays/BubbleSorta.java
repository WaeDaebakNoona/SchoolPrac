/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Arrays;

/**
 *
 * @author NaritaA
 */
public class BubbleSorta {
    public static void main(String[] args) {
        
        int [] arr = {4,5,6,7,8,9,1,2};
        
        for(int sortIndex = arr.length -1;sortIndex > 0; sortIndex--){
            for(int currentIndex = 0; currentIndex < sortIndex; currentIndex++){
                if(arr[currentIndex]>arr[sortIndex]){
                    int temp = arr[currentIndex];
                    arr[currentIndex] = arr[sortIndex];
                    arr[sortIndex] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
//for (int i = subjects.length-1; i > 0 ; i--) {
//            for (int j = 0; j < i; j++) {
//                if(yearMarks[j]< yearMarks[j+1]){
//                    int temp = yearMarks[j+1];
//                    yearMarks[j+1]= yearMarks[j];
//                    yearMarks[j] = temp;
//                }
//            }
//            
//        }
//selsection
//        for (int i = 0; i < subjects.length; i++) {
//            for (int j = i+1; j < subjects.length; j++) {
//                if(yearMarks[j]< yearMarks[i]){
//                    int temp = yearMarks[i];
//                    yearMarks[i]= yearMarks[j];
//                    yearMarks[j] = temp;
//                }
//            }
//            
//        }