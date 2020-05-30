package com.sapient.week1;

/**
 * CheckEven
 *
 */
class CheckEven
{ 
    // Returns true if n is even, else odd 
    public static boolean check(int n) 
    { 
        return (n % 2 == 0); 
    } 
      
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 101; 
        if(check(n) == true) 
            System.out.print("Even"); 
        else
            System.out.print("Odd"); 
    } 
} 
