package others;

public class Fibonacci {

	public static void main(String[] args) {
		int count=15;
		int [] a=new int[count];
		a[0]=0;
		a[1]=1;
		for(int i=2;i<count;i++)
		{
			a[i]=a[i-1]+a[i-2];
			System.out.println(a[i]);
		}

	}

}
