package demo_Package;

public class Test1 
{
	public static void main(String[] args) 

	{
	
		int a = 100;
		int b = 50;
		int c = 30;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greater = " +a);
			}
			else
			{
				System.out.println("c is greate = " +c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is greater = " +b);
			}
			else 
			{
				System.out.println("c is greater = " +c);
			}
		}
		
		System.out.println("-------------------------------------------");
		
		int d = 190;
		int e = 110;
		int f = 200;
		int g = 500;
		
		if(d>e)
		{
			if(d>f)
				
			{ 
				if(d>g)
				{
					System.out.println("d is greater");
				}
				else
				{
					System.out.println("e is greater");
				}
			
			}
			else 
			{
				if(e>f)
				{
					if(e>g)
					{
						System.out.println("e is greater");
					}
					else
					{
						System.out.println("g is greater");
					}
				}
			}
		}
		else 
		{
			if(f>g)
			{
				System.out.println("f is greater");
			}
			else
			{
				System.out.println("g is greater");
			}
		}
		
		
		
		
		
	}
}
