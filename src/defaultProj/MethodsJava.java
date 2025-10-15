package defaultProj;

public class MethodsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsJava d = new MethodsJava();
		String name = d.getData(); 
		System.out.println(name);
		
		MethodsJava2 d2 = new MethodsJava2(); // created object of the other class and access the method 
		d2.getUserData(); // sysout one is printed 2 times 
		getData2();     // no need for d.getdata() as the method is static
		
	}
   public  String getData() {
	   System.out.println("Hello Gorgeous");
	   return "Hello how are you doing today ?";
   }
   
   // static method 
   public static  String getData2() {
	   System.out.println("Have a fantastic evening");
	   return "Hello how are you doing today ?";
   }
}
