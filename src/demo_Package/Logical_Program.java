package demo_Package;

public class Logical_Program 
{
	//even number
	public static void main(String[] args) 
	{
		for(int i=1; i<=50; i++)
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("---------------------");
		//odd number
		
		for(int i=2; i<=50; i++)
		{
			if (i%2!=0)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("---------------------");
		
		int j=2;
		while(j<=50)
		{
			if(j%2==0)
			{
				System.out.println(j);
			}
			j++;
		}
		
		while(j<=50)
		{
			if(j%2!=0)
			{
				System.out.println(j);
			}
			j++;
		}
		
		System.out.println("---------------------");
		
		int k=1;
		while(k<=10)
		{
			System.out.println(k);
			k++;
		}
		
		System.out.println("---------------------");
		
		while(k>=1)
		{
			System.out.println(k);
			k--;
		}
		

	}

}
