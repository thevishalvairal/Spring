package com.nt.factroy;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.FirstFlight;
import com.nt.comp.FlipKart;

public class FlipKartFactory {
	private static Properties props;
	static {
		InputStream is=null;
		try {
			//locate property file using streams
			is=new FileInputStream("src/com/nt/commons/info.properties");
			// load properties file into java.util.properties Object
			props=new Properties();
			props.load(is);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}// static
	public static FlipKart getInstance() throws Exception {
		System.out.println("FlipKartFactory.getInstance()");
		Courier courier=null;
		FlipKart fpkt=null;
		//get dependent class and create class object
courier=(Courier)Class.forName(props.getProperty("sdp.dependent")).newInstance();
		// create Target class object 
		fpkt=new FlipKart();
		//assign dependent class object to target class object
		fpkt.setCourier(courier);
		return fpkt;
	}//method
}//class
