package Pushpa;
import java.util.Scanner;

public class For6 
{
	public static void main(String[] args) {
		{
			Scanner sc =new Scanner(System.in);
			int n; 
			int fact=1;
			int i;
			System.out.println("Enter the value of n:");
			n=sc.nextInt();
			
			if(n==0||n==1)
			{
				System.out.println("Factorial of "+n+ "is" +fact);
				
			}
			else
			{
				for(i=1;i<=n;i++)
				{
					fact=fact*i;
					
				}
				System.out.println(fact);
				
				
			}
			
			
		}
	}

}
