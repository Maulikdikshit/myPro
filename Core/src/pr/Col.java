package pr;

import java.util.ArrayList;
import java.util.Iterator;

public class Col
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(2.96);
		al.add('A');
		al.add("sheela");
		for(int i=0; i<al.size();i++)
		{
			Object r = al.get(i);
			System.out.println(r);
			
		}
		System.out.println("********for**********");
		for(Object r: al)
		{
			System.out.println(r);
			
		}
		System.out.println("*********for each***********");
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Object r = it.next();
			System.out.println(r);
		}
		System.out.println("*********Iterator***********");
		
		
	}

}
