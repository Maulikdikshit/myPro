package others;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class So {

	public static void main(String[] args) {
		
		
		HashSet hs=new HashSet();
		hs.add("2");
		hs.add("9");
		hs.add("6");
		hs.add("3");
		hs.add("2");
		System.out.println("size of hash"+hs.size());
		Iterator it =hs.iterator();
		while(it.hasNext())
		{
			Object t=it.next();
			System.out.println(t);
		}
		hs.remove("2");
		System.out.println("new size of hash"+hs.size());
		boolean j=hs.contains("9");
		System.out.println(j);
		
		Object ar[]=hs.toArray();
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		

	
		
		

	}

}
