package LogicalPrograms;

public class WordReverse 
{

	public static void main(String[] args) 
	{
		wordreverse("This is a test");
	}

	static void wordreverse(String s)
	{
		String a[]=s.split(" ");
		String s1="";
		for(int i=a.length-1;i>=0;i--)
		{
			s1+=a[i]+" ";
		}
		System.out.println(s1);
	}
}

