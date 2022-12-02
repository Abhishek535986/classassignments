package Array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
	
    int arr[],size,i,key,pos=-1;
    Scanner SC=new Scanner(System.in);
    System.out.println("Enter the size of a array :");//taking size from input
    size=SC.nextInt();
    arr=new int[size];//storing size
    System.out.println("Enter "+size+" elements in an array :");
    for(i=0;i<size;i++)
    {
    	arr[i]=SC.nextInt();
    }
    System.out.println("Enter the elements that user wants to search!!!");
    key=SC.nextInt();
    for(i=0;i<size;i++)
    {
    	if(arr[i]==key)
    	{
    		pos=i;
    		break;
    	}
    }
    if(pos!=-1)
    	System.out.println(key+ "found at "+(pos+1)+ "position");
    else
    {
    	System.out.println("Data not found in a array!");
    }
	}

}
