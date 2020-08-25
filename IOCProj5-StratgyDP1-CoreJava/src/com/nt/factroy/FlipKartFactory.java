package com.nt.factroy;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.FirstFlight;
import com.nt.comp.FlipKart;

public class FlipKartFactory {

	public static FlipKart getInstance(String courierName) {
		System.out.println("FlipKartFactory.getInstance()");
		Courier courier=null;
		FlipKart fpkt=null;
		//create Dependent class object
		if(courierName.equalsIgnoreCase("dtdc"))
			courier=new DTDC();
		else if(courierName.equalsIgnoreCase("BlueDart"))
			courier=new BlueDart();
		else if(courierName.equalsIgnoreCase("firstflight"))
			courier=new FirstFlight();
		else 
			throw new IllegalArgumentException("inavlid couier type");
		// create Target class object 
		fpkt=new FlipKart();
		//assign dependent class object to target class object
		fpkt.setCourier(courier);
		return fpkt;
	}
}
