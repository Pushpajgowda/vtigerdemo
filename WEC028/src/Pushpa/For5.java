package Pushpa;
import java.util.Scanner;
public class For5 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int num;
		int n=10;
		System.out.println("Enter the number");
		num=sc.nextInt();
		int multiple;
		for(int i=1;i<=n;i++)
		{
			multiple=num*i;
		System.out.println(multiple);
		}
	
	}

}