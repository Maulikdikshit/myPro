package pr;

public class Ar4 {

	public static void main(String[] args)
	{
		int m=1;
      String x="go and learn something";
      String y[]=x.split(" ");
      for(int i=0;i<y.length;i++)
      {  
    	  if(m%2==0)
    	  {
    		  char c[]=y[i].toCharArray();
    		  for(int k=c.length-1;k>=0;k--)
    		  {
    			  System.out.print(c[k]);
    		  }
    	  }
    	  else
    	  {
    		  System.out.print(y[i]);
    	  }
    	  m++;
    	  System.out.print(" ");
    			  
      }
    	 
	}
}


