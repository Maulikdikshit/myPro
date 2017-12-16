package others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Li {

	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList();
	al.add("2");
	al.add("3");
	al.add("2");
	al.add("6");
	for(int i=0;i<al.size();i++)
	{
		Object k=al.get(i);
		System.out.println(k);
	
	}

	System.out.println("**********");
	
	Iterator it=al.iterator();
	while(it.hasNext())
	{
		Object k=it.next();
		System.out.println(k);
	}
	ListIterator li=al.listIterator();
	while(li.hasNext())
	{
		Object q=li.next();
		System.out.println(q);
	}
	System.out.println("********************************************************************");
	HashSet hs=new HashSet();
	hs.addAll(al);
	for(Object c:hs)
	{
		System.out.println(c);
	}
	}

}
