/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysexamples;

/**
 *
 * @author RC_Student_lab
 */
public class ArraysExamples {

    public static void main(String[] args) {
         
        int [] prices = {200, 150, 700, 400};
        String [] items = {"shirt", "Pants", "Sneakers", "Jacket"};
        int sum =0, Average;
        for(int i =0; i < prices.length; i++){
            sum = sum + prices[i];
            
        }
        System.out.println("The Sum is:  "+sum);
        Average = sum/prices.length;
        System.out.println("The Average is:  "+Average);
        
        int min = prices[prices.length-1];
        for(int i=0; i<prices.length;i++){
            if(min>prices[i]){
                min = prices[i];
            }
        }
        System.out.println("The Minimum price is:  "+min);
        
        int max = prices[0]; 
        
        String temp = null;
        for(int i =0; i<prices.length; i++){
            if(max<prices[i]){
                max = prices[i];
                temp = items[i];
            }
        }
        System.out.println("The Maximum price is:  "+max);
        System.out.println("The Item with the highes price is:  "+temp);
   
    
        
}
}