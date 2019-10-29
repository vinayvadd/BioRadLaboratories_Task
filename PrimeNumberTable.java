package com.codetask;
import java.util.Scanner;

/**
 * @author vinay
 *
 */
public class PrimeNumberTable {
	
	public static void main(String args[]) {
		int[] primeNumArray = null;
		System.out.println("Enter valid integer number ..");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size <= 0) {
			System.out.println("Not a valid integer number !");
		} else {
			primeNumArray = primeNumbersArray(size);
			if (primeNumArray != null) {
				
				for (int i = 0; i < primeNumArray.length; i++) {
						System.out.print(primeNumArray[i] * 1 + "    ");
						for (int j = 0; j < primeNumArray.length; j++) {
							System.out.print(primeNumArray[i] * primeNumArray[j]+ "    ");
						}
						System.out.println(" ");
				}
					
			}
		}
	}
	
/*
 *   primeNumbersArray method will return you prime numbers int[] object
 */
    private static int[] primeNumbersArray(int size){
    	int[] primeNumbers=new int[size];
    	int ct=0,n=0,i=1,j=1;  
    	System.out.print("     ");
    	while(n<size)  
    	{  
    		j=1;  
    		ct=0;  
    		while(j<=i)  
    		{  
    			if(i%j==0)  
    				ct++;  
    			j++;   
    		}  
    		if(ct==2)  
    		{  
    			primeNumbers[n]=i;
    			System.out.print(i+ "    ");
    			n++;  
    		}  
    		i++;  
    	}
    	System.out.println("    ");
    	return primeNumbers;
    }  
   
}
