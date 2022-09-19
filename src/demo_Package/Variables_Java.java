package demo_Package;

public class Variables_Java 
{
	
	static int i=10; // global static variable
	int j=20; // global non-static variable
	
	Variables_Java() // constructor
	{
		char c='r';
		System.out.println(c);
		
	}
	static void demo(int k) // declaration of method
	{
		//int a=20; // local variable
		
		Variables_Java v=new Variables_Java();
		System.out.println(v.j);
		System.out.println(i);
		k=50;
		System.out.println(k);
	}
	
	public static void main(String[] args) 
	{
		demo(i);
		
		
	}

}
