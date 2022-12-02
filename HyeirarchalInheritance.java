package OOPSConcept;

class Bank
{
	int rateofInterest()
	{
		return 8;
	}
}
class SBI extends Bank
{
	int rateofInterest()
	{
		return 3;
	}
}
class ICICI extends Bank
{
	int rateofInterest()
	{
		return 5;
	}
}

public class HyeirarchalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI sbi=new SBI();
		System.out.println("Rate of Interest is: "+sbi.rateofInterest()+" %");

	}

}
