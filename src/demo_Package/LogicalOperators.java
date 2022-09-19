package demo_Package;

public class LogicalOperators 

{
    public static void main(String[] args) 
    {
	
    	boolean a = true;
    	boolean b = false;
    	  	
    	// AND (&&)
        boolean c = a&&b;
        System.out.println(c);
    
    	boolean r = (5>3) && (5>6);
    	System.out.println(r);
    	
    	// OR (||)
    	
    	r = a||b;
    	System.out.println(r);
    	
    	r = (7==10)||(7!=7);
    	System.out.println(r);
    	
    	//NOT (!)
    	
    	boolean t = !true;
    	System.out.println(t);
    	
    	
    	
    }
	
	
}
