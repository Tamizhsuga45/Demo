package com.bank2;

import com.bank.Account;

public class Customer extends Account 
{
	public static void main (String[]args)
	{
		Customer x=new Customer();
		x.address="vidhyanagar chennai";
		x.location="chennai";
		x.setAcc_no("accno 56789");
		x.setIfsc_code("ifsccode 12345678");
		x.amount=18000.00;
		System.out.println(x.address);
		System.out.println(x.location);
		System.out.println(x.amount);
		System.out.println(x.getAcc_no());
		System.out.println(x.getIfsc_code());
		
		
	}

}