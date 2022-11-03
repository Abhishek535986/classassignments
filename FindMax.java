package basicprogram;

import java.util.Scanner; //import java library

public class FindMax {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;   //initialize two variable
		
		Scanner SC =new Scanner(System.in);   //create a object
		System.out.println("Enter the First Number");   //take input
		a=SC.nextInt();  //store variable
		
		System.out.println("Enter the Second The Number");
		b=SC.nextInt();
		
		if(a>b)    //condition
		{ 
			System.out.println("The First Number is Greater");
		}
		else
		{
			System.out.println("The Second Number is Greater");
		}
		
	}

}
