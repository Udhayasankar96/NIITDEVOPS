package array;
import java.util.Arrays;

public class Array
{
	public static void main(String[] args)
	{
	int x[]={25,98,24,45};
	System.out.println("beforew sorting");
	System.out.println(Arrays.toString(x));
	Arrays.sort(x);
	System.out.println("after sorting");
	System.out.println(Arrays.toString(x));
}
}
