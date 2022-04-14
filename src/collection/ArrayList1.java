package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		al.add(123);
		al.add("velocity");
		al.add("pune");
		al.add(null);
		al.add("4 dec");
		System.out.println(al);
		
//		System.out.println("====================================");
//		
//		Iterator<Object> it = al.iterator();
//		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//		
//		System.out.println("====================================");
//		
//		for(int i=0;i<=al.size()-1;i++)
//		{
//			System.out.println(al.get(i));
//		}
		
		System.out.println("====================================");
		// for each
		for (Object o:al)
		{
			System.out.println(o);
		}
		
		System.out.println(al.contains("velocity"));
		System.out.println(al.isEmpty());
		System.out.println(al.indexOf("velocity"));
		
		al.add(2, "mumbai");
		System.out.println(al);
		
		al.remove(5);
		System.out.println(al);
		
		al.remove("pune");
		System.out.println(al);
		
		Iterator<Object> it = al.iterator();
		ListIterator<Object> lit = al.listIterator();
		lit.
		
		
		

	}

}
