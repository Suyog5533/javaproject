package casting_study;

public class Upcasting_study {

	public static void main(String[] args) {
		
		Son s = new Son();
		s.bike();
		s.car();
		s.sunglass();
		System.out.println("**************************************");
		Father f= new Father();
		f.bike();
		f.car();
		System.out.println("**************************************");
		Father uf = new Son(); //object of subclass reference of superclass
		uf.bike(); //upcastting
		uf.car(); //upcasting
		//uf.sunglass(); //not eligible for upcasting bcuz cant upcast method which is not common.
		System.out.println("**************************************");

	}

}

