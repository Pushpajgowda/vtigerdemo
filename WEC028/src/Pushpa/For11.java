package Pushpa;
import java.util.Scanner;
public class For11 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int start,end,pcount=0,ncount=0,zcount=0;
		System.out.println("Enter the starting number of range");
		start=sc.nextInt();
		System.out.println("Enter the ending number of range");
		end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(i<0)
			{
				ncount++;
			}
			else if(i==0)
			{
				zcount++;
			}
			else
			{
				pcount++;
			}
		}
		System.out.println("count of negative numbers "+ncount);
		System.out.println("count of zeroes "+zcount);
		System.out.println("count of positive numbers "+pcount);
	}

}
