package others;

import java.util.ArrayList;
import java.util.Iterator;

public class Practice {

	public static void main(String[] args) {
	
	ArrayList<String> al= new ArrayList<String>();
	al.add("frank");
	al.add("castle");
	al.add("punisher");
	al.add("punisher");
	al.add("punisher");
	al.add("punisher");
	al.add("devil");
	al.add("castle");
	al.add("murdoch");
	al.add("castle");
	al.add("karen");
	
	Iterator it = al.iterator();
	Object name = "";
	
	while(it.hasNext())
	{
		 name=it.next();
		System.out.println(name);		
	    System.out.println("+++++++++++++++++++++++++++");
	if(name.equals("punisher"))
		{
			System.out.println("not adding to other list");
		}
	else
		{
		ArrayList<String> al1 = new ArrayList<String>();
			al1.add(name.toString());	
			Iterator it1=al1.iterator();
			while(it1.hasNext())
			{
				Object name1=it1.next();
			
				System.out.println(name1);
			}
		}
		}
	}}
	
	


