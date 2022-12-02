package OOPSConcept;

import java.util.Scanner;

class calculator
{
		int add(int a,int b)
		
		{
		return (a+b);
		}
    	float add(int a,float b)
	   {
	   return (a+b);
	   }

}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator calc =new calculator();
		System.out.println(calc.add(10,20.5f));
		

	}

}
