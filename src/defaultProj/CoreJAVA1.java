package defaultProj;

public class CoreJAVA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		// Java supports diff data types  : integer , sting etc
		int num = 5; // premitive data type is integer type is non Premitive String 
		String content = "Bhumika Gohiya's Project ";
		char letter ='r';
		double dec = 5.99;
		
		boolean myalidation =true;
		
		System.out.println(num + " is the value stored in the Num Variable"); //mix variable with  string plus + here is concatenation
	    
		//Arrays
		int[] arr = new int [5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 17;
		arr[3] = 103;
		arr[4] =567;
		
		// way 2 to intialize an array
		 
		
		//System.out.println(arr2[3]);
		
		 // For Loop
		 //How to print values present in array
		
		for (int i= 0; i< arr.length; i++)
		 // i iterates and increments by 1 hence ++ so we ask array to repeat itself until it reaches the range 
	{
		
		System.out.println(arr[i]);
	}
		
	String[] color = {"Pink","Black","Red"};
		for(int k =0; k<color.length;k++)
		
		{
			System.out.println(color[k]);
		}
	 //alternate way to write syntax for array
		for(String s: color)
		{
			System.out.println(s);
		}
	}

}
