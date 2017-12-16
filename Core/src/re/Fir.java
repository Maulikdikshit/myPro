package re;

public class Fir {

	public static void main(String[] args) {
		String s1="cat";
		String s2="cat";
		//s2=s2+"is not dog";
		//String s3=s2.concat("is not dog");
		//System.out.println(s3);
		//String s2=new String("cat");
		if(s1.equals(s2))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(s1==s2)
		{
			System.out.println("==true");
			
		}
		else
		{
			System.out.println("==false");
		}

	}

}
