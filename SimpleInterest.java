package basicprogram;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float principle,time,rate,SI;   //declaring variable
		
		Scanner scan =new Scanner(System.in);  //creating object
		
		System.out.println("Enter the principle amount");  //taking input
		principle =scan.nextFloat();                       //storing variable
		
		System.out.println("Enter the time");
		time =scan.nextFloat();
		
		System.out.println("Enter the rate");
		rate =scan.nextFloat();
		
	    SI =(principle * time * rate) / 100;    //storing result
		
		System.out.println("The Simple Interest of Amount is: " +SI);    //output

	}

}
