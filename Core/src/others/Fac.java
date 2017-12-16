package others;

public class Fac {
	
	public int fa(int a)
	{
		int m = 1;
		for(int i=1;i<a;i++)
		{
			
			 m = m*i;
		}
		
	
		return m;
	}

	public static void main(String[] args) 
	{
		
	Fac v = new Fac();
	 v.fa(8);
	 System.out.println(v.fa(8));

	}

}
