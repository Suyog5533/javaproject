package String_Study;

public class StringMethods {

	public static void main(String[] args) {
		// without using new keyword
		// String objname="value";---> constant pool area
		// with using new keyword
	   // String objname= new String("value")---> non-constant pool area
		
		String ss="Suyog";
		String ss1= new String("Suyog Sneha");
		System.out.println(ss.length());
		System.out.println(ss1.length());
		System.out.println(ss.toUpperCase());
		System.out.println(ss1.toUpperCase());
		
		
		
		String s="Suyog";
		String s1 = new String("Suyog 123");
		String s2="Suyog";
		System.out.println((s==s2));
		String s3 = new String("Suyog 123");
		System.out.println((s1==s3)); //memory location
		System.out.println((s1.equals(s3))); //value
		System.out.println((s.equals(s2))); //value
		System.out.println(s.contains(s2));
		System.out.println(s.endsWith("og"));
		System.out.println(s1.startsWith("Su"));
		System.out.println(s1.concat(s2));
		System.out.println(s3.charAt(2));
		System.out.println(s2.equalsIgnoreCase(s));
		System.out.println(s3.substring(2));
		System.out.println(s3.substring(2, 6));
		
		String ss2=" ";
		System.out.println(ss2.isBlank());   //isBlank method doesn't consider space
		System.out.println(ss2.isEmpty());    //isEmpty method considers space
		
		
		
//		String R="Rushikesh";
//		System.out.println(R.toUpperCase());
//		String SR= R.toUpperCase();
//		System.out.println(SR);
//		System.out.println(SR.toLowerCase());
		
	}

}
