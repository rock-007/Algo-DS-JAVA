/**
 * 
 */
package com.datastructureandalgo.all;

/**
 * @author Umair
 *
 */
public class Recursion {

    /**
     * @param args
     */
    static int num = 3;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
     //   System.out.println(iterativeFactorial(num));
        System.out.println(Factorial(num));
    }
/*
    public static int iterativeFactorial(int num) {
        if (num == 0) {
            return 1;

        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {

            factorial *= i;

        }
        return factorial;
    }
    */
    public static int  Factorial(int num) {
       // int i=num;
        if(num==0) {
            
            return 1;
        }   
     
        return num *Factorial(num-1);
        
    }
}
