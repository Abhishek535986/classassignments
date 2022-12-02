package Array;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
    int first[],sec[],third[],size1,size2,i,k;
    Scanner SC=new Scanner(System.in);
    
    System.out.println("Enter the size of first array :");
    size1=SC.nextInt();
    first=new int[size1];
    System.out.println("Enter "+size1+" elements in the first array :");
    for(i=0;i<size1;i++)
    {
    	first[i]=SC.nextInt();
    }
    System.out.println("Enter size of second array :");
    size2=SC.nextInt();
    sec=new int[size2];
    System.out.println("Enter "+size2+" elements in the second array :");
    for(i=0;i<size2;i++)
    {
    	sec[i]=SC.nextInt();	
    }
    third=new int[size1+size2];
    for(i=0;i<size1;i++)
    {
    	third[i]=first[i];
    }
    k=i;
    for(i=0;i<size2;i++)
    {
    	third[k++]=sec[i];
    }
		System.out.println("And the result after merging is ::");
		for(i=0;i<third.length;i++)
		{
			System.out.println(third[i]+" ");
		}

	}

}
