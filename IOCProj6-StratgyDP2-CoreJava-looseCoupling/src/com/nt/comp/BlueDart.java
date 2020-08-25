package com.nt.comp;

public final class BlueDart implements Courier {
public BlueDart() {
System.out.println("BlueDart::0-param Constructor");
}
	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		return "BlueDart will deliver order id::"+oid+"order product";
	}

}
