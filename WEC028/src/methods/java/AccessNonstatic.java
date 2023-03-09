package methods.java;

class demo1
{
	int a=78;
	static int b=2;
	void test()
	{
		System.out.println("Test method");
	}
	static void task()
	{
		System.out.println("task method");
	}
}

public class AccessNonstatic 
{	
	byte r=54;
	void run()
	{
		System.out.println("run method");
	}
	public static void main(String[] args) 
	{
		demo1 d1=new demo1();
		int a=1;
		System.out.println(a);
		System.out.println(new demo1().a);
		System.out.println(new AccessNonstatic().r);
		new demo1().test();
		demo1.task();
		System.out.println(demo1.b);
		new AccessNonstatic().run();
		System.out.println(d1.a);
		d1.test();
	}

}
