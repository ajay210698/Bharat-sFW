package com.comcast.crm.Contact_Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.comcast.crm.BaseclassUtility.Baseclass_Test;

@Listeners(com.comcast.ListenersUtility.Listenersusage.class)
public class Test1  extends Baseclass_Test{

	@Test
	public void demo() {
		
		System.out.println("hi everyone");
       assertEquals("bharath", "matti");
	}
}
