package sahaj_practise;

public class StudentReport {

	public static void main(String[] args) {
		//Student mark 
		// pass or fail
		// mark <35 fail
		// mark 35-50 grade c
		// mark 50-80 grade b
		// mark > 80 grade a
       int mark = 30;
       if (mark < 35)
       {
	    System.out.println("Im fail");
       }
       else if(mark <= 50 && mark >=35)
       {   
    	   System.out.println("Im pass");
           System.out.println("I got grade c");
    	   }
       else if(mark<=80 && mark > 50)
    	   {
    		   System.out.println("i got grade B");
    	   }
       else
    	   {
    		 System.out.println("I got grade A");  
    	   }
}
	}


