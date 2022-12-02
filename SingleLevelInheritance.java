package OOPSConcept;

class Parent
{
	void parentMethod()
	{
		System.out.println("This is a parent class");
	}
	
}


class Child extends Parent
{
	void childMethod()
	{
		System.out.println("This is a child class");
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child obj =new Child();
		obj.parentMethod();
		obj.childMethod();

	}

}
