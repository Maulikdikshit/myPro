package others;

public class FizzBuzz {

	public static void main(String[] args) {
		
		for(int i=1;i<=50;i++)
		{
			if(i%15==0)
			{
				System.out.println("fizzbuzz   "+i);
			}
			else if(i%5==0)
			{
				System.out.println("buzz   "+i);
			}
			else if(i%3==0)
			{
				System.out.println("fizz   "+i);
			}
			
		}
	

	}

}
