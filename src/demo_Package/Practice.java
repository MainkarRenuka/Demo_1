package demo_Package;

public class Practice 
{
	static int a=10;
	int b=20;
	
	public static void staticMethod()
	{
		System.out.println("Static method of class Practice");
	}
	public static void NonstaticMethod()
	{
		System.out.println("Non-Static method of class Practice");
	}
	
	public static void main(String[] args) 
	{
		System.out.println(a);
		Practice.staticMethod();	
		Practice p = new Practice();
		p.b=50;
		p.a=70;
		System.out.println(p.b);
		System.out.println(p.a);
		Practice.NonstaticMethod();
		
		Methods_1 m = new Methods_1();
		m.nonStaticMethod();
		System.out.println(m.b);
		System.out.println(m.a);
		
		m.a=80;
		System.out.println(m.a);
		System.out.println("-------------------------");
		
		        //0 1 2 3 4 5
		//int n[]= {1,6,8,4,5,9};
		for(int d=0;d<=10;d++)
		{
			if(d%2==0)
			{
				System.out.println(d);				
			}
		}
		System.out.println("-------------------------");
		
		//for(int d=0;d<n.length;d++)
		//{
		//	if(d%2!=0)
		//	{
		//		System.out.println(n[d]);				
		//	}
		//}
		
		
		
	}
}
