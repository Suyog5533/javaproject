package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		
		Vector<Object> v =  new Vector<>();
		
		v.add("Pune");
		v.add(123);
		v.add('v');
	v.add(null);
	v.add(null);
	v.add("velocity");
	
	System.out.println(v);
	
	Enumeration<Object> en = v.elements();
	while(en.hasMoreElements())
	{
		System.out.println(en.nextElement());
	}
		
    v.remove(1);
    System.out.println(v);
    
	}

}
