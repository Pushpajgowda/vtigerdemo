package Pushpa;
import java.util.Scanner;
public class For12 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int start_number,end_number,arm=0;
		int count=0,rem=0;
		System.out.println("Enter a number");
		start_number=sc.nextInt();
		System.out.println("Enter a number");
		end_number=sc.nextInt();
		for(int i=start_number;i<=end_number;i++)
		{
		int temp=i;
		while(temp>0)
		{
			rem=temp%10;
			arm=arm+(rem*rem*rem);
			temp=temp/10;
		
		if(i==arm)
		{
			System.out.print(i+"number is armstrong");
		}
		else
		{
			System.out.println(i+"number is not a armstrong");
		}
		
	}}

}
}

