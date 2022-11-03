package basicprogram;

import java.util.Scanner;   //import library

public class MaxMin {
	
	public static void main(String[] args)
	{
		int num1,num2,num3,max;   //initialize variable
		
		Scanner SC =new Scanner(System.in);   //create object
		System.out.println("Enter the three number :");  //take input
		num1 =SC.nextInt();  //store variable
		num2 =SC.nextInt();
		num3 =SC.nextInt();
		
		if(num1>num2)  //condition
		{
			if(num1>num3)
			{
				
				max=num1;
			}
			else
			{
				max=num3;
			}
		}
		else
		{
			if(num2>num3)
			{
				max=num2;
			}
			else
			{
				max=num3;
			}
		}
		
		System.out.println("The maximum number is :"+max);  //output
		
	}

}
