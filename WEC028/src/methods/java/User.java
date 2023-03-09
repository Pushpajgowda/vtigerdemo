package methods.java;
interface Zomato
{
	void menu();
	void orderfood();
	void delivery();
}
class Dominos implements Zomato
{
	public void menu()
	{
		System.out.println("display all");
	}
	public void orderfood()
	{
		System.out.println("order the food using dominos");
	}
	public void delivery()
	{
		System.out.println("deliver the food");
	}
}
class Mcdonalds implements Zomato
{
	public void menu()
	{
		System.out.println("display menu");
	}
	public void orderfood()
	{
		System.out.println("order");
	}
	public void delivery()
	{
		System.out.println("delivery");
	}
}
class ZomatoApp
{
	Zomato Orderonline(char rest)
	{
		if(rest=='d')
		{
			return new Dominos();
		}
		else
		{
			return new Mcdonalds();
		}
	}
}

public class User 
{

	public static void main(String[] args) 
	{
		ZomatoApp food=new ZomatoApp();
		Zomato ref=food.Orderonline('a');
		ref.menu();
		
		ref.orderfood();
		ref.delivery();

	}

}
