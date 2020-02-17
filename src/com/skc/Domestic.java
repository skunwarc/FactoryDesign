package com.skc;

public class Domestic implements Billing {
	

	@Override
	public void getBill() {
		System.out.println("This is a bill for Domestic.");
	}

}
