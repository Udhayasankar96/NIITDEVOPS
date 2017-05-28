
package exception;
public class Exceptionhandling {
	public static void test(int a) throws ArithmeticException
	{
		int j=10/a;
	  //System.out.println("Throws from mehtod");
	}
public static void main(String[] args) {
	
	try
	{
		int i=90/0;
		System.out.println("try");
	}
	catch(ArithmeticException ex)
	{
		System.out.println("Catch:"+ex);
		
	}
	try
	{
		throw new ArithmeticException();
	}
	catch(ArithmeticException ae)
	{
		System.out.println("Sample Throws");
	}
	try
	{
		test(0);
	}
	catch(ArithmeticException ae1)
	{
		System.out.println("Exception from Method Throws"); 
	}
	
}
}
