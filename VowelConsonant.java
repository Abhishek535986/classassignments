package basicprogram;

public class VowelConsonant {
	
	public static void main(String []args)
	
	{
		char ch='c';  //initialize variable
		if((ch=='a'||ch=='A')||(ch=='e'||ch=='E')||(ch=='i'||ch=='I')||(ch=='o'||ch=='O')||
				(ch=='U'||ch=='U'))   //condition
		{
			System.out.println("The Charachter is vowel :"+ch);
	}
		else 
		{
			System.out.println("The Charachter is not vowel :"+ch);
		}
	}

}
