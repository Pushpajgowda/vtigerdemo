package methods.java;

public class MethodInput1 
{
	public static void RechargeShop(long phone, int amt,String network)
	{
		System.out.println("Recharge");
		System.out.println(phone);
		System.out.println(amt);
		System.out.println(network);
	}
	public static void main(String[] args) 
	{
		System.out.println("customer");
		RechargeShop(97548574l,5754,"jio");
		RechargeShop(845798346l,979,"kvnjsbv");
		
	}

}
