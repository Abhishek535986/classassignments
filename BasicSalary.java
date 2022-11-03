package basicprogram;

import java.util.Scanner;  //import java library

public class BasicSalary {
 
	public static void main(String []args) {
	 int bs,hra,da,ts;  //intialize variable
	
	Scanner SC=new Scanner(System.in);   //creating object
	System.out.println("Enter the basic salary: "); //taking input
	bs =SC.nextInt();  //storing variable input
	
	if(bs<=10000)   //condition
	{
		hra=(bs*20/100);
		da= (bs*80/100);
	}
	else if((bs>10000)&&(bs<=20000))  //condition
	{
		hra=(bs*25/100);
		da= (bs*90/100);
	}
	else
	{
		hra=(bs*30/100);
		da= (bs*95/100);
	}
	
	ts= bs+hra+da;   //total calculation for salary
	
	System.out.println("The Total Salary is :"+ts); //output
	
    }
}