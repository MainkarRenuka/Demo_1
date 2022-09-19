package demo_Package;

public class WhileLoop 
{
	public static void main(String[] args) 
	{
		//while(condition)
		//{ body -- definition}
		
		int a=100;
		while (a>2)
		{
			
			a=a/2;
			System.out.println(a);
		}
		
		System.out.println("---------------------------");
	
		int b=2;
		
		while(b<20)
		{
			System.out.println(b);
			b=b*2;
					
		}
		
		System.out.println("---------------------------");
		
		int c=0;
		while (c<50)
		{
			
			c = c+2;
			System.out.println(c);
		}
		
		System.out.println("---------------------------");
		
		/*
		 *    *
		 *   ***
		 *  *****
		 * *******
		 *  *****
		 *   ***
		 *    *
		 * 
		 */
		
		
		for (int i=1; i<=7; i++)
		{
			for (int j=7; j>i; j--) 
			{
				System.out.print(" ");
			}
			for (int k=1; k<=(2*i-1); k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=1; i<=6; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for (int k=11; k>=(2*i-1); k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
System.out.println("------------------------");
		
		/*
		 *     *
		 *    * *
		 *   * * *
		 *  * * * *
		 * * * * * * 
		 *  * * * *
		 *   * * * 
		 *    * *
		 *     *
		 */
		
		for (int i=1; i<=6; i++)
		{
			for (int j=6; j>i; j--)
			{
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=1; i<=5; i++)  // for star line number
		{
			for (int  j=1; j<=i; j++) // for space count
			{
				System.out.print(" ");
			}
			for (int k=5; k>=i; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	
	}

}



