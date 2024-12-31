package com.lalit.sbeans;

import java.time.LocalTime;

public class WishMessageGeneretor 
{
	private LocalTime lt; // Has-A property

	public WishMessageGeneretor() 
	{
		System.out.println("0 parameter constructor....");
	}	
	// Setter for set the Localtime object reference 
	public void setLt(LocalTime lt) 
	{
		System.out.println("WishMessageGeneretor.setLt()");
		this.lt = lt;
	}

	// business logic method 
	
	public String generateWishMessage(String user)
	{
		int hour=lt.getHour();
		if(hour<=12) return "Good Morning "+user;
		else if (hour<=16) return "Good Afternoon "+user;
		else if(hour<=20) return "Good Evening "+user;
		else return "Good Night "+user;
		
	}
	
}
