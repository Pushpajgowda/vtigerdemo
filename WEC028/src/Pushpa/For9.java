package Pushpa;
import java.util.Scanner;
public class For9 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter a number");
		num=sc.nextInt();
		boolean flag=true;
		if(num>0)
		{
			for(int i=2;i<num;i++)
			{
				if (num%i == 0)
				{
					flag=false;
					break;
				}
			}
			
		}
		if(flag == true && num>1)
		{
			System.out.println("the given number is prime");
			
		}
		else
		{
		System.out.println("the given number is not a Prime ");
		}
	}
		
	
}
