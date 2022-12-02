package OOPSConcept;

import java.util.Scanner;

public class PerfectNumber {
	
	static boolean perfect(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
			if(sum==num)
				return true;
			else
			 return false;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=SC.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(perfect(i))
			{
				System.out.println("The number is perfect number :"+i);
			}
			
		}	

	}
}

