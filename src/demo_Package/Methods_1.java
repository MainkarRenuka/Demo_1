package demo_Package;

public class Methods_1 
{
	static int a=10;
	int b=20;
	
	public static void staticMethod()
	{
		System.out.println("Static method of class Method_1");
		
	}
	
	public void nonStaticMethod()
	{
		System.out.println("Non-static method of class Method_1");
	}
	
	public static void main(String[] args) 
	{
		System.out.println(a); //calling of static variable
		staticMethod();		   //calling of static method
		
		Methods_1 d=new Methods_1();  // object of same class
		System.out.println(d.b);      //calling of non static variable
		d.nonStaticMethod();          // calling of non static method
	}

}
