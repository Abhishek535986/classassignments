package Array;

import java.util.Scanner;

public class AddTwoMatrices {
	
	public static void main(String args[])
	{
		int a[][],b[][],c[][],i,j,row,col;
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the row :");
		row=SC.nextInt();
		System.out.println("Enter the col :");
		col=SC.nextInt();
		
		a=new int[row][col];
		b=new int[row][col];
		c=new int[row][col];
		
		System.out.println("Enter "+row+" X "+col+" matrix :");
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=SC.nextInt();
			}
		}

		System.out.println("Enter "+row+" X "+col+" matrix :");
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				b[i][j]=SC.nextInt();
			}
			}
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
					c[i][j]=a[i][j]+b[i][j];
				}
			}
		System.out.println("Addition of Matrix A and B is  : ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(c[i][j]+ " ");
				
			}
			System.out.println();
			
		}
			}
	}
	


