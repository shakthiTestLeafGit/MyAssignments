package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		
		/** Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
		Print first number
		Iterate from 1 to the 11
		Add first and second number assign to sum
		Assign second number to the first number
		Assign sum to the second number
		Print sum
		 *  0  1  1  2  3  5  8  13  21  34  55  89  144
		 */

				int firstNum=0, secNum=1, sum=0;
			    System.out.print(firstNum+" ");
			    System.out.print(secNum+" ");
			    for(int i=1; i<=11; i++)
			    {
			    	sum= firstNum+secNum;
			    	firstNum=secNum;
			    	secNum=sum;
			    	System.out.print(sum +" ");
			    }
			    
			}

		
	}


