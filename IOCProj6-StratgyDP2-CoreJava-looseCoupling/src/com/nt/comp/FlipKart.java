package com.nt.comp;

import java.util.Arrays;
import java.util.Random;
//final---rule3
public final class FlipKart {
	// property
	private Courier courier; //rule1,2
public FlipKart() {
System.out.println("FlipKart::0-param constructor");
}
	public void setCourier(Courier courier) {//rule2
		System.out.println("FlipKart.setCourier()");
		this.courier = courier;
	}

	// b. method
	public String shoping(String[] items, float[] prices) {
		System.out.println("FlipKart.shoping()");
		float billAmt=0.0f;
		int oid=0;
		String msg=null;
		Random rad=null;
		
		//calculate BillAmount
		for(float p:prices)
			//billAmt=billAmt+p;
			billAmt+=p;
		
		// generate order id Dynamically as random number
		rad=new Random();
		oid=rad.nextInt(10000);

		// use courier service for delivering the  products
		msg=courier.deliver(oid);
		
		 // retrun bill Amt and courier details to customer
		return Arrays.toString(items)+"are purchased having prices"+Arrays.toString(prices)+"With bill Amount"+billAmt+"---"+msg;
	}

}
