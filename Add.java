package basicprogram;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TO take a input
		
		//Scanner scan=new Scanner(System.in);  //to create a object
		//long num;   //intialize variable
		//System.out.println("Enter the number"); //taking input
		
		//num = scan.nextLong();  //storing variable
		// System.out.println("The value you have entered: "+ num);  //output
		
		//To add a two number
		//int a = 100;   //initialize variable
		//int b = 200;
		
		//int sum = a + b;   //calculation
		
		//System.out.println("The Sum of Two Number is :" +sum);  //output
		
		//To take a input and two number
		
		int a, b, sum;   //intialize variable
		
		Scanner scan =new Scanner(System.in);  //creating object
		
		System.out.println("Enter The First Number :");   //taking input
		a=scan.nextInt();  //storing variable
		
		System.out.println("Enter the Second Number :");
		b=scan.nextInt();
		
		sum = a + b;   //calculation
		System.out.println("The Sum of two number is: "+sum);  //result
		
		
		

	}

}
