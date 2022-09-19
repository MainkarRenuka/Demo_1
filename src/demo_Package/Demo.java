package demo_Package;

public class Demo 
{
	static int a;
	static float b;
	static char c;
	static boolean d;
	static String e;
	
	Demo()
	{
		a=10;
		b=20.5f;
		c='O';
		d=true;
		e="Velocity";
		
	}
	
	Demo(int r)
	{
		a=20;
		b=40.5f;
		c='V';
		d=false;
		e="Testing";
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println(a);
		new Demo();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		System.out.println("---------------------------");
		
		new Demo(10);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}
  
}
