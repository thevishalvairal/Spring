package com.nt.test;

import com.nt.comp.FlipKart;
import com.nt.factroy.FlipKartFactory;

public class StratagyDPTest {
	public static void main(String[] args) {
FlipKart fpkt=null;
fpkt=FlipKartFactory.getInstance("firstflight");
System.out.println(fpkt.shoping(new String[] {"rain coat","umbrella","flu tablets"}, 
		                                                          new float[] {500,300,50}
                                                                )
		                               );
	}//main
}//class
