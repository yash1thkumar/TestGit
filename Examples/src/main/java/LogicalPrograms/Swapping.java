package LogicalPrograms;

public class Swapping {

	public static void main(String[] args) 
	{
		swap(10, 20);
	}

	static void swap(int a,int b)
	{
		System.out.println("Before swapping : a="+a+", b="+b);
//		int c=a;
//		a=b;
//		b=c;
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After swapping : a="+a+", b="+b);
	}
}
