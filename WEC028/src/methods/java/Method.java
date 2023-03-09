package methods.java;

public class Method
{
	public static void walk()
	{
		System.out.println("walk....");
	}
	public static void talk()
	{
		System.out.println("talk.....");
	}
	public static void main(String[] args) 
	{
		System.out.println("after wake up");
		walk();
		talk();
		task();
		task();
		walk();
		System.out.println("gert ready");
		
	}
	public static void task()
	{
		System.out.println("task");
	}
	
}
