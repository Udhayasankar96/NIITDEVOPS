package string;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		String s1=" ";
	
	String s2=" " ;
	Scanner sc=new Scanner(System.in);
			System.out.println("the string is");
	s1=sc.next();
	for(int i=s1.length()-1;i>0;i--)
	
			{
		s2=s2+s1.charAt(i);}
	System.out.println(s2);
	
	
	if(s1==s2)
	{
	
			System.out.println("its a palindrome");
			}
	else
			{
				System.out.println("its not a palindrome");
			}
		
		}}

