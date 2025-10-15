package defaultProj;

public class CoreJavaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		//String is a object // string literal
		// no new object created being the same value 
		
		String s = " Bhumika Project";
		String s1 = " Bhumika Project";
		String s2 = " Bhumika Project";
		
		// using new  hence explicitly to create memory for each object irrespective of being the same value 
		String s3 = new String ("Bhumika Project");
		String s4 = new String ("Bhumika Project");
		
	    String c ="Carleton University Graduate Student";
	    c.split(" "); // split on the base of space hence 3 strings are created 
	    String[] splittedString = c.split(" ");
	    System.out.println(splittedString[0]);
	    System.out.println(splittedString[1]);
	    System.out.println(splittedString[2]);
	    
	    System.out.println("********************");
	     // now split of the bases of a condition here say graduate hence it will be divided in two halves
	    String[] splittedString2 = c.split("Graduate ");
	    System.out.println(splittedString2[0]);
	    System.out.println(splittedString2[1]);
	    
	    // Print character by character like c, a , r ...
	    
	    for (int i=0; i<c.length();i++)
	    {
	    	System.out.println(c.charAt(i))	; // character at ith index 
	    }
	    System.out.println("********************");
	    for (int i=s.length()-1; i>=0;i--) // reverse order
	    {
	    	System.out.println(c.charAt(i))	; // character at ith index 
	    }
	}

}
