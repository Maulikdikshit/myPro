package pr;

public class Ar2
{
	
	public static void main(String[] args) 
	{
		String x="go and learn something";
		String d[]=x.split(" ");
		for(int j=0;j<4;j++)
		{
		char c[]=d[j].toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.print(c[i]);
			
		}
		
		}
		

	}

}
