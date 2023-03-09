package Pushpa;
import java.util.Scanner;
public class For10
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a;
		int n,esum=0,osum=0;
		System.out.println("Enter the First number");
		a=sc.nextInt();
		System.out.println("Enter the last number");
		n=sc.nextInt();
		for(int i=a;i<=n;i++)
		{
			if(i%2==0)
			{
				esum=esum+i;
			}
			
			else
			{
				osum=osum+i;
			}
		}
		System.out.println("the sum of even numbers  is " +esum);
		System.out.println("the sum of odd numbers is "+osum);
		
	}

}
