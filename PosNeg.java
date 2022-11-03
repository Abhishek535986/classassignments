package basicprogram;

import java.util.Scanner;   //import java library

public class PosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num;  //initialize variable
		Scanner SC= new Scanner(System.in);   //create object
		
		System.out.println("Enter the number");  //take input
		num = SC.nextFloat();  //store variable
		
		if (num>0)   //condition
		{
			System.out.println("The Number is Positive");
		}
		else
		{
			System.out.println("The Number is Negative");
		}

	}

}
