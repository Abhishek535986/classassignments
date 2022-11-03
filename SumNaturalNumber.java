package basicprogram;

import java.util.Scanner;

public class SumNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,n,sum=0;  //initialize variable
		
		Scanner SC =new Scanner(System.in);
		System.out.println("Enter the range: ");
		n=SC.nextInt();
		
	
		
		for(i=1;i<=n;i++)
		{
			sum =sum+i;
		}
		
		System.out.println("The sum of naturl number from 1 to "+n+" is: "+sum);

	}

}
