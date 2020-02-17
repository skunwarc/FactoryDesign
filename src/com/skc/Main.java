package com.skc;

public class Main {
	public static void main(String[] args) {
		
		Factory factory = new Factory();
		
		Billing billing = factory.computeBill("Domestic");
		billing.getBill();
		
	}
	
}
