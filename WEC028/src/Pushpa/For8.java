package Pushpa;
import java.util.Scanner;
public class For8 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int number;
		int rev=0;
		int rem=0;
		System.out.println("Enter the number to be reversed");
		number=sc.nextInt();
		int temp=number;
		while(temp>0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println("The reversed number is "+rev);
		if(number==rev)
		{
			System.out.println("The given number is Palindrome");
		}
		else
		{
			System.out.println("The given number is not a Palindrome");
			
		}
	}

}
