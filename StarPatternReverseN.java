package basicprogram;

import java.util.Scanner;

public class StarPatternReverseN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the number:");
		x=SC.nextInt();
		
		for(int i=x;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			SC.close();
		}

	}

}
