package defaultProj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJAVA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr2 = {1,17,89,34,6,111,45,66,2};
		
		// i want multiples of 2 hence write a for loop logic 
		 for(int i=0; i<arr2.length;i++)
		 {
			 if(arr2[i]%2 == 0) // == to compare 2 numbers 
			 {
				 System.out.println(arr2[i]+"  is  a multiple of 2");
			     break; // used to break hence once we satisfy the logic it will come out of the for loop 
			 }
			 
			 else
			 {
				 System.out.println(arr2[i] + "  is not a multiple of 2");
			 }
		 }
		 
		 ArrayList<String> a = new ArrayList<String>();
		 //create object of the class - we can then use methods by syntax like object.method
	     a.add("Orange");
	     a.add("Brown");
	     a.add("Pink");
	     a.get(1);// extract the second value from arr list
	     
	     System.out.println(a.get(1));
	     
	     for(int i =0; i<a.size();i++)
	     {
	    	 System.out.println(a.get(i));
	     }
	     System.out.println("*****************");
	     for( String val:a)
	     {
	    	 System.out.println(val);
	     }
	     
	     // How to verify is any word is present in the list Eg : Brown is in the list of not ?
	     System.out.println(a.add("Brown"));
	     String[] color = {"Pink","Black","Red"};
	     
	      // Converted traditional Array to Array list  now we can utilize the array methods
	     
	     List<String> colorArrayList = Arrays.asList(color);
	}

}
