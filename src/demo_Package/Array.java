package demo_Package;

public class Array 
{
	public static void main(String[] args) 
	{
		//Data type VariableName [] = {v1, v2, v3,...vn };
		//Data type[] VariableName = {v1, v2, v3,...vn };
		
		        //0, 1, 2, 3, 4
		int a[]= {10,20,30,40,50};  // size  = 5
		int size = a.length;
		
		System.out.println(size);
		System.out.println("-------------------------");
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		System.out.println("-------------------------");
		
		
		char[] c= {'a','b','c'};
		
		System.out.println(c[0]);
		System.out.println("-------------------------");
		
		String[] s= {"Velocity","testing","class"};
		
		System.out.println(s[1]);
		
		System.out.println("-------------------------");
		
		for(int b=0; b<a.length;b++)
		{
			System.out.println(a[b]);
		}
		System.out.println("-------------------------");
		
		for(int b=size-1;b>=0;b--)
		{
			System.out.println(a[b]);
		}
		System.out.println("-------------------------");


		
		int n[]= {1,2,3,4,5};
		for(int d=0;d<=n.length;d++)
		{
			if(d%2==0)
			{
				System.out.println(n[d]);				
			}
		}
		System.out.println("-------------------------");
		
		for(int d=0;d<n.length;d++)
		{
			if(d%2!=0)
			{
				System.out.println(n[d]);				
			}
		}
		System.out.println("-------------------------");
		
		//String t[]=new String[5];
		//System.out.println(t[1]);
		
		
	}

}
