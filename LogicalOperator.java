package basicprogram;

import java.util.Scanner;    //import java library

public class LogicalOperator {
 
	public static void main(String []args)
	{
		int num1,num2,num3,max=0;    //initialize variable

		Scanner SC=new Scanner(System.in);   //create object
		
		System.out.println("Enter the three numbers:");   //take input
		
		num1= SC.nextInt();   //storing variable
		num2= SC.nextInt();
		num3= SC.nextInt();
		
		if((num1>num2)&&(num1>num3))  //condition
			max=num1;
		else if((num2>num1)&&(num2>num3))
			max=num2;
		else if((num3>num1)&&(num3>num2))
			max=num3;
		
		System.out.println("The maximum number is : " +max);   //output
			
	}	
	
}



