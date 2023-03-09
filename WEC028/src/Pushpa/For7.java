package Pushpa;
import java.util.Scanner;
public class For7 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int a, n,pow=1;
		System.out.println("Enter the value of a");
		a=sc.nextInt();
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		if(n==0)
		{
			System.out.println(+a+ " to the power of "+n+ " is " +pow);
			
		}
		else if(n==1)
		{
			pow=a;
			System.out.println(+a+ " to the power of "+n+ " is " +pow);

		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				pow=pow*a;
			}
			System.out.println(+a+ " to the power of "+n+ " is " +pow);
		}
		
	}

}
