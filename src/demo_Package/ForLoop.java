package demo_Package;

public class ForLoop 
{
	public static void main(String[] args) 
	{
		//Loops
		
		//for
		
		//Syntax
		
		int i;
		int j;
		
		for (i=0; i<7; i++) 
		{
			System.out.println("*");
		}	
		
		System.out.println("------------------------");
		
		for (i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		
		System.out.println("------------------------");
		
		for (i=7; i>0; i--)
		{
			System.out.println(i);
		}
		System.out.println("------------------------");
		
		for (i=0; i<7; i++) 
		{
			System.out.print("*");
		}	
		System.out.println();
		System.out.println("------------------------");
		
		for (i=1; i<4; i++) 
		{
			for (j=1; j<6; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		System.out.println("------------------------");
		
		for (i=1; i<6; i++) 
		{
			for (j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		
		
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		for (i=1; i<6; i++) 
		{
			for (j=5; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * ***** 
		 * 
		 */
		
		System.out.println("------------------------");
		
		
		for (i=1; i<=6; i++)  // for star line number
		{
			for (j=6; j>i; j--) // for space count
			{
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		
		/*
		 * ******
		 *  *****
		 *   ****
		 *    ***
		 *     **
		 *      *
		 */  
		
		
		for (i=0; i<=5; i++)  // for star line number
		{
			for (j=0; j<i; j++) // for space count
			{
				System.out.print(" ");
			}
			for (int k=5; k>=i; k--)
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
		 * 
		 */
		
		for (i=1; i<=6; i++)  // for star line number
		{
			for (j=6; j>i; j--) // for space count
			{
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		
		/*					L    st     (2L-1)
		 *     *			1    1       2*1-1=1
		 *    ***			2    3
		 *   *****			3    5
		 *  *******			4    7
		 * ********* 		5    9
		 * 
		 */
		for (i=1; i<=6; i++)  // for star line number
		{
			for (j=6; j>i; j--) // for space count
			{
				System.out.print(" ");
			}
			for (int k=1; k<=(2*i-1); k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		
		
		/*					L    st     (2L-1)
		 * *******			1    1       2*1-1=1
		 *  *****			2    3
		 *   ***			3    5
		 *    *			    4    7
		 */
		for (i=1; i<=6; i++)  // for star line number
		{
			for (j=1; j<i; j++) // for space count
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
		 * * * * * * 
		 *  * * * *
		 *   * * * 
		 *    * *
		 *     *
		 */
		
		for (i=1; i<=6; i++)  // for star line number
		{
			for (j=1; j<=i; j++) // for space count
			{
				System.out.print(" ");
			}
			for (int k=6; k>=i; k--)
			{
				System.out.print("* ");
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
		
		for (i=1; i<=6; i++)
		{
			for (j=6; j>i; j--)
			{
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for (i=1; i<=6; i++)  // for star line number
		{
			for (j=1; j<=i; j++) // for space count
			{
				System.out.print(" ");
			}
			for (int k=6; k>i; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("------------------------");
		
		/*					L    st     (2L-1)
		 *     *			1    1       2*1-1=1
		 *    ***			2    3       2*2-1=3
		 *   *****			3    5
		 *  *******			4    7
		 * ********* 		5    9
		 *  *******
		 *   *****
		 *    ***
		 *     *
		 */
		
		for (i=1; i<=5; i++)  // for star line number
		{
			for (j=5; j>i; j--) // for space count
			{
				System.out.print(" ");
			}
			for (int k=1; k<=(2*i-1); k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (i=1; i<=7; i++)  // for star line number
		{
			for (j=1; j<=i; j++) // for space count
			{
				System.out.print(" ");
			}
			for (int k=7; k>=(2*i-1); k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------");
		
		/*
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * ***** 
		 *  ****
		 *   ***
		 *    **
		 *     *
		 */
	
		for (i=1; i<=6; i++)  // for star line number
		{
			for (j=6; j>i; j--) // for space count
			{
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (i=0; i<=5; i++)  // for star line number
		{
			for (j=0; j<=i; j++) // for space count
			{
				System.out.print(" ");
			}
			for (int k=5; k>i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------");
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
	
		for (i=1; i<=6; i++) 
		{
			for (j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (i=1; i<=6; i++) 
		{
			for (j=5; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
	}

}

/* 1/ for = syntax
 *    for (variable initialization; condition; increment/decrement operator)
 *    {
 *      // for - body /defination
 *    }
 */


