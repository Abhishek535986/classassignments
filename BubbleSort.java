package Array;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String args[])
	{
		int arr[]=new int[10],i,j,temp;
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the number of elements in an array :");
		for(i=0;i<10;i++) 
		{
			arr[i]=SC.nextInt();
		}
		System.out.println("Before sorting the values are :");
		for(i=0;i<10;i++)
		{
			System.out.println(arr[i]+" ");
		}
		for(i=0;i<10;i++)
		{
			for(j=i+1;j<10;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("The values after sorting are :");
		for(i=0;i<10;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
