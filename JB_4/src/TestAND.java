/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * created by 21343063_Nurul Husna
 */
public class TestAND {
    public static void main (String[] args){
        int i = 0;
        int j = 10;
        boolean test = true;
        
        //demonstrasi
        test = (i > j) && (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        
        test = ( i > j) & (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
                
    }
}
