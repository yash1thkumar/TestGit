package LogicalPrograms;

public class Palindrome1 {

	public static void main(String[] args) 
	{
//		palindromeornot("abcba");
		palindromeornot(123);
	}

	static void palindromeornot(String s)
	{
		String r="";
		for(int i=s.length()-1;i>=0;i--)
		{
			r+=s.charAt(i);
		}
		
		if(s.equals(r))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}
	
	static void palindromeornot(int a)
	{
		String s="";
		String s1=String.valueOf(a);
	
		for(int i=s1.length()-1;i>=0;i--)
		{
			s+=s1.charAt(i);
		}
		
		if(s1.equals(s))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}
}
