package methodoverriding;

public class Riding extends Overriding {
	public void test()
	{
		System.out.println("the output of the second function");
	}
	public static void main(String[] args) {
		Riding obj1=new Riding();
		obj1.test();
		System.out.println("the output is");
	}}

