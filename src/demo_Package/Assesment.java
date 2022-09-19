package demo_Package;

public class Assesment 
{
	public static void main(String[] args) 
	{
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=8; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=8; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=8; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=8; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		
		for(int i=1; i<=6; i++)
		{
			for(int j=6; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=6; k>i; k--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		System.out.println("----------------------------------");
		
		int l = 48;
		
		if(l%2==0)
		{
			System.out.println("l is even number");
		}
		else
		{
			System.out.println("l is odd number");
		}
		
		System.out.println("----------------------------------");
		
		for (int i=1; i<=4; i++) // suqare
		{
			for (int j=1; j<=8; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		
		for (int i=1; i<=6; i++)//quadrant 4 triangle
		{
			for(int j=6; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		
		for (int i=1; i<=6; i++)//quadrant 1 triangle
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		
		for (int i=1; i<=6; i++)//quadrant 2 triangle
		{
			for(int j=6; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		
		for (int i=1; i<=6; i++)//quadrant 3 triangle
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int k=6; k>=i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		
		for (int i=1; i<=6; i++)//normal triangle
		{
			for(int j=6; j>i; j--)
			{
				System.out.print(" ");
			} 
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		
		for(int i=1; i<=6; i++)//reverse triangle
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int k=6; k>=i; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}

}
