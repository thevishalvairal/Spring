package com.nt.test;

import com.nt.comp.FlipKart;
import com.nt.factroy.FlipKartFactory;

public class StratagyDPTest {
	public static void main(String[] args) {
FlipKart fpkt=null;
try {
	// get target class object using factory
fpkt=FlipKartFactory.getInstance();
}
catch (Exception e) {
	e.printStackTrace();
	System.out.println("Problem in dependency management");
}
System.out.println(fpkt.shoping(new String[] {"rain coat","umbrella","flu tablets"}, 
		                                                          new float[] {500,300,50}
                                                                )
		                               );
	}//main
}//class
