package sahaj_practise;

public class StringStudy {

	public static void main(String[] args) {
		
		String s1="Suyog Wagaskar";
		String s2= new String("Suyog Wagaskar");
		System.out.println(s1.length());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.indexOf('W'));
		System.out.println(s2.startsWith("S"));
		System.out.println(s1.contains("Suyog"));
		
		System.out.println("========");
		System.out.println(s1.endsWith(s2));
		System.out.println(s1.endsWith("r"));
		System.out.println("========");
		
		String s3= "";
		
		System.out.println(s3.isBlank());
		System.out.println(s3.isEmpty());
		
		System.out.println(s2.charAt(4));
		System.out.println(s1.concat(s2));
		System.out.println(s1.substring(3));
		System.out.println(s1.replace('W', 's'));
		System.out.println(s1.lastIndexOf("y"));
		System.out.println("========");
		
		
		
		
		
		
		
	}

}
