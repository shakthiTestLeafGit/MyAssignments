package week1.day1;

import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
		
		/** Goal: To understand the problem solving, looping and conditional statement

a) Create a class by name: IsPrime
b) Create a main method using shortcut
c) Write a logic to find if the given number is prime or not
d) Print if it is prime or not

Hint: Iterate through all numbers from 2 to n-1 (input) and 
for every number check if it divides n (input). 
If we find any number that divides, print prime.
If nothing divides, then print non-prime
		 * 
		 */
		
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter any number:\n");
		int input=in.nextInt();	
		int i=0;
		for( i=2;i<=input-1;i++)
		{
			if(input%i==0) {
				System.out.println(input + "is not a prime number");
				break;
			}
		}
		if(i==input)
			System.out.println(input + "is a prime number");
		
			
	}

}
