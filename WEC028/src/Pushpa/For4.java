
package Pushpa;
import java.util.Scanner;
public class For4 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int f;
		int l;
		System.out.println("Enter the first number");
		f=sc.nextInt();
		System.out.println("Enter the last number");
		l=sc.nextInt();
		int sum=0;
		for(int i=f;i<=l;i++)
		{
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println(sum);
	
	}

}
