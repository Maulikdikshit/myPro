package others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lis {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(5);
		l.add(2);
		Comparator c =Collections.reverseOrder();
		Collections.sort(l,c);
		for(int i=0;i<l.size();i++)
		{
			Object r = l.get(i);
			System.out.println(r);
		}

	}

}
