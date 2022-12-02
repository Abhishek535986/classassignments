package Array;

import java.util.Scanner;

public class MultidimesionalArray {
	
	public static void main(String args[])
	{
		int arr[][],i,j,row,col;
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the row :");
		row=SC.nextInt();
		System.out.println("Enter the col :");
		col=SC.nextInt();
		
		arr=new int[row][col];
		
		System.out.println("Enter "+row+" X "+col+" matrix");
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr[i][j]=SC.nextInt();
			}
		}
		
		System.out.println("Elements are : ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
