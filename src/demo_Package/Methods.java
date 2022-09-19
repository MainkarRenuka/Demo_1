package demo_Package;

public class Methods 
{
	
	static int a=10;
	static int b=20;
	public static void xyz() // user define method
	{
		// repeated code/ method body
		int c =a+b;
		System.out.println(c);
	}
	
	public static void addition(int i, int j) // user define method
	{
		
		int c =i+j;
		System.out.println(c);
	}
	
	public static void addition(int i, int j, int k)
	{
		
		int c =i+j+k;
		System.out.println(c);
	}
	
	public static void addition(char i, int j)
	{
		
		int c =i+j;
		System.out.println(c);
	}
	
	public static void main(String[] args)  // system define method
	{
		
		xyz();
		addition(30, 50);
		addition(30, 50, 70);
		addition('i', 7);
		
		System.out.println("-----------------");
		
		int n1 = 50;
		int n2 = 20;
		int n3 = 40;
		int n4 = 38;
		
		if (n1>n2)
		{
			if (n1>n3) 
			{
				if (n1>n4)
				{
					System.out.println("n1 is greater");
				}
				else
				{
					System.out.println("n4 is greater");
				}
			}
			else
			{
				if (n3>n4)
			{
				System.out.println("n3 is greater");
			}
				else
				{
					System.out.println("n4 is greater");
				}
			}
		}
		else
			
		{
			if (n2>n3) 
			{
				if (n2>n4)
				{
					System.out.println("n2 is greater");
				}
				else
				{
					System.out.println("n3 is greater");
				}
				
			}
			else
			{
				if (n3>n4)
				{
					System.out.println("n3 is greater");
				}
					else
					{
						System.out.println("n4 is greater");
					}
			
			}
		}
		
		
	}

}
