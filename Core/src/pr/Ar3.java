package pr;

public class Ar3 {

	public static void main(String[] args)
	{  
		String x="go and learn something";
		String a[]=x.split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			String b = a[i];
			char c[]=b.toCharArray();
			for(int j=c.length-1;j>=0;j--)
			{
				System.out.print(c[j]);
			}
		
		
		}
		
		
		
		

	}

}
