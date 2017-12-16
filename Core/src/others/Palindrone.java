package others;

public class Palindrone {

	public static void main(String[] args) {
		int n=121;
		int s=n;
		int nw=0;
		
		while(n>0)
		{
			int r=n%10;
			 n=n/10;
			 nw=nw*10+r;
			 
			 System.out.println(nw);
			 
			
		}
		if(nw==s)
		{
			System.out.println(nw+"is palindrone");
		}
		else
		{
			System.out.println(nw+"is not palindrone");
		}

	}

}
