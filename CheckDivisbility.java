package basicprogram;

import java.util.Scanner;  //import java library

public class CheckDivisbility {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;  //initialize variable
		Scanner SC=new Scanner(System.in);  //creating object
		System.out.println("Enter the number:");  //taking input
		num=SC.nextInt();  //storing variable
		 
		if((num%5==0)&&(num%11==00))  //check condition
		{
			System.out.println("The Number is Divisble by 5 & 11 :"+num);  //output
		}
		else {
		   System.out.println("The Number is Not Divisble by 5 & 11:"+num);
		}

	}

}
