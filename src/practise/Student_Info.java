package practise;

public class Student_Info {

	public static void main(String[] args) {
		
Student_Info ob1= new Student_Info();
ob1.Personal_Info("Suyog Wagaskar",55,7.8);
ob1.Personal_Info("Prashant Shinde",56,9.5);
	}
public void Personal_Info(String Name, int Roll_No,double Marks)
{
System.out.println("My name is "+Name);
System.out.println("Roll No "+Roll_No);
System.out.println("Marks "+Marks);
}
}