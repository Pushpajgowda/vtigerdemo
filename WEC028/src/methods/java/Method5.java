package methods.java;

public class Method5 
{
	public static void login()
	{
		System.out.println("Logged in succesfully");
		logout();
	}
	public static void main(String[] args) 
	{
		System.out.println("class is started");
		login();
		
	}
	public static void logout()
	{
		System.out.println("logged out successfully");
	}

}
