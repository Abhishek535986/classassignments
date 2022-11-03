package basicprogram;

import java.util.Scanner;   //import java library

public class TotalMarks {
	
	public static void main(String []args)
	{

	float Math, English, Science, Hindi, Computer, Sum,Per;  //initialize variable
	
	Scanner SC= new Scanner(System.in);  //create object
	
	System.out.println("Enter the Math Marks: "); //take input
	Math = SC.nextFloat();  //store variable
	
	System.out.println("Enter the English Marks: ");
	English = SC.nextFloat();
	
	System.out.println("Enter the Science Marks: ");
	Science = SC.nextFloat();
	
	System.out.println("Enter the Hindi Marks: ");
	Hindi = SC.nextFloat();
	
	System.out.println("Enter the Computer Marks: ");
	Computer = SC.nextFloat();
	
	Sum = (Math + English + Science + Hindi + Computer);   //calculation
	
	Per = (Sum/500)*100;   //percentage
	
	if(Sum>=300)  //condition
	{
		System.out.println("The Student is pass");
	}
	else
	{
		System.out.println("The Student is Failed");
	}
	
	System.out.println("The total marks of five subject is: " +Sum);
	
	System.out.println("The total marks of five subject is: " +Per + "%");
	}

	
	
}
