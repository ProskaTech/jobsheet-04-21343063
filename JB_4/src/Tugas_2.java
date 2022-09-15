/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * created by 21343063_Nurul Husna
 */
public class Tugas_2 {
    public static void main(String[]args){
        int x = 10;
        int y = 23;
        int z = 5;
        int highest;
        
        highest = (y >= x)? y:x;
        highest = (z>=highest)? z:highest;
        
         System.out.println("number 1 = "+x);
        System.out.println("number 2 = "+y);
        System.out.println("number 3 = "+z);
        System.out.println("Average is = "+highest);
        
    }
    
}
