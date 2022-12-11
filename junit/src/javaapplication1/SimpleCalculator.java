/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Abdullah Mohammed
 */
public class SimpleCalculator {
    
    
    
     public int addNumbers(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
     
    public int add(int number1, int number2){
    
    return number1 + number2;
    }
}
