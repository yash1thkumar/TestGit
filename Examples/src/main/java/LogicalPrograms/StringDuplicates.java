package LogicalPrograms;

public class StringDuplicates {

	public static void main(String[] args) 
	{
		dup("abcbdaa");
	}

	static void dup(String s)
	{
		int count=0;
		char a[]=s.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]='0';
					count++;
				}
			}
			if(a[i]!='0'&& count>1)
			{
				System.out.println(a[i]+" repeated "+count+" times");
			}
		}
		
	}
}
