package com.skc;

public class Factory {

	public Billing computeBill(String Type) {
		if (Type == null) {
			return null;
		}
		if (Type.equalsIgnoreCase("DOMESTIC")) {
			return new Domestic();
		}
		else if (Type.equalsIgnoreCase("COMMERICAL")) {
			return new Commerical();
		}
		else if (Type.equalsIgnoreCase("INSTITUTIONAL")) {
			return new Institutional();
		}
		return null;
	}
}
