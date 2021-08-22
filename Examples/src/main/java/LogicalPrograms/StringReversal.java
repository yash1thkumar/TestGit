package LogicalPrograms;

import java.util.Arrays;

public class StringReversal {

	public static void main(String[] args)
	{
		strever("ABCD");
	}

	static void strever(String s)
	{
//		String r="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			r=r+s.charAt(i);
//		}
//		
//		System.out.println(r);
		
//		StringBuilder s1=new StringBuilder(s);
//		s1.reverse();
//		System.out.println(s1);
		
		char a[]=new char[s.length()];
		int j=0;
		for(int i=a.length-1;i>=0;i--)
		{
			a[j]=s.charAt(i);
			j++;
		}
		
		System.out.println(Arrays.toString(a));
	}
}

