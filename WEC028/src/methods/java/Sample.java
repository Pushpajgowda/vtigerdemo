package methods.java;
class Sample1
{
	
	Sample1(String res)
	{
		System.out.println("string");
	}
	Sample1()
	{
		this("res");
		System.out.println("no");
	}
}
public class Sample {

	public static void main(String[] args)
	{
		Sample1 s1=new Sample1();
		
	}

}
