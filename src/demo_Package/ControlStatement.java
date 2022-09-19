package demo_Package;

public class ControlStatement 
{
	public static void main(String[] args) 
	{
		int a =20;
		int b =70;
		boolean result = (a==b);
	
		if (result) // true // false
		{
			System.out.println("a is greater than or equal to 10");
		}
		
		else
		{
			System.out.println("a is smaller than 10");
		}
		
		int marks = 45;
		if (marks > 75) // true // false
		{
			System.out.println("Take admission in Sci");
		}
		
			else if ((marks >=60)&&(marks <=75))
				{
					System.out.println("Take admission in Com");
				}
					else if (marks >=35)
						{
							System.out.println("Take admission in Arts");
						}
						else
						{
							System.out.println("You are failed");
						}														
		
		int value = 0;
		if (value < 0)
		{
			System.out.println("Value is negative");
		}
		else if (value > 0)
		{
			System.out.println("Value is positive");
		}
		else 
		 	{
				System.out.println("Value is zero");	
		 	}
		System.out.println("-------------------------");
		
		marks = 68;
		if (marks >=95) // true // false
		{
			
		if (marks >85)
				{
					System.out.println("Division A");
				}
					else if (marks >75)
						{
							System.out.println("Division B");
						}
				
						else if (marks >65)
						{
							System.out.println("Division C");
						}
				
		}			
		else 
			{
				System.out.println("Rest student in D division");
			}
		
		
		
		
		
		
		/* 1) if = syntax
		 *    if(condition)
		 *    {
		 *      // if - body /defination
		 *    }
		 */
	
		/* 2) if-else = syntax
		 *    if(condition)
		 *    {
		 *      // if - body /defination
		 *    }
		 *    else(condition)
		 *    {
		 *      // else - body /defination
		 *    }
		 */
		/* 3) if-else = syntax
		 *    if(condition 1)
		 *    {
		 *      // if - body /defination  .... if condition 1 is true
		 *    }
		 *    else if (condition 2)
		 *    {
		 *      // else - body /defination  .... if condition 2 is true and condition 1 is false
		 *    }
		 *    else if (condition 3)
		 *    {
		 *      // else - body /defination  .... if condition 3 is true
		 *    }
		 *    else(condition)
		 *    {
		 *      Condition 1, 2, 3 false   // else - body /defination
		 *    }
		 */
		/* 4) Nested if-else = syntax
		 *    if(condition)
		 *    {
		 *    if (condition 1)
		 *    {
		 *      // if - body /defination  .... if condition 1 is true
		 *    }
		 *    else if (condition 2)
		 *    {
		 *      // else - body /defination  .... if condition 2 is true and condition 1 is false
		 *    }
		 *    else if (condition 3)
		 *    {
		 *      // else - body /defination  .... if condition 3 is true
		 *    }
		 *    }
		 *    else(condition)
		 *    {
		 *      Condition 1, 2, 3 false   // else - body /defination
		 *    }
		 */
		
		
		
		
		
		
		
	}


}
