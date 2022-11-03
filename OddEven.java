package basicprogram;

import java.util.Scanner;   //import java library

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;   //initialize variable
		Scanner SC=new Scanner(System.in);   //create object
		System.out.println("Enter the number: ");   //take input
		num =SC.nextInt();   //store variable
		 
		if (num%2==0)   //condition
				{ 
			System.out.println("The Number is Even Number :"+ num);
				}
		else {
			System.out.println("The Number is Odd Number :"+num);
			
		}
	}
	

}
