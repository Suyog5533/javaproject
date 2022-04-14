package practise;

public class MethodStudy {

	public static void main(String[] args) {
		
System.out.println("this is my main method");
test1();
MethodStudy2.test2();
MethodStudy object1 =new MethodStudy();
object1.test3();
MethodStudy2 object2 = new MethodStudy2();
object2.test4();
	}

public static void test1()
{
System.out.println("im running static method from same class");
}
public void test3()
{
	System.out.println("im running non static method from same class");
}
}

