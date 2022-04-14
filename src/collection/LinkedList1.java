package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {

	public static void main(String[] args) {
	LinkedList<Object> al = new LinkedList<>();
		
		al.add(123);
		al.add("velocity");
		al.add("pune");
		al.add(null);
		al.add("4 dec");
		System.out.println(al);
		
		Iterator<Object> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(Object o:al)
		{
			System.out.println(o);
		}
		
		System.out.println("==============");
		
		ListIterator<Object> it1 = al.listIterator();
		
		while(it1.hasNext()) 
		{
			System.out.println(it1.next());
		}

	}

}
