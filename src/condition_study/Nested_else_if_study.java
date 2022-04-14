package condition_study;

public class Nested_else_if_study {

	public static void main(String[] args) {
		// if username is correct please enter password
		// if password is correct get signin in account
		String username = "Sneha";
		String password = "Suyog@1998";
		if (username=="Suyog")
			{
					System.out.println("Please enter password");
					if(password=="Suyog@1997")
					{
						System.out.println("Welcome Signing your account");
					}
					else
					{
						System.out.println("Enter correct password");
					}
			}
		else if (username=="Sneha")
				{
					System.out.println("Please enter password");
					if(password=="Suyog@1998")
					{
						System.out.println("Welcome Signing your account sneha");
					}
					else
					{
						System.out.println("Enter correct password");
					}
			}
		else 
			{
				System.out.println("username is incorrect.Please provid correct username");	
			}
	}

}
