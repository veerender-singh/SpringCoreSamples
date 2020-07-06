package com.sample.beans;

public class WishMsgGenerator {
	
	private java.util.Date date;
	
	public WishMsgGenerator(java.util.Date date) {
		this.date = date;
	}
	
	
	public java.util.Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public String wishMessage(String user) {
		int hour = 0;
		
		hour = getDate().getHours();
		
		if(hour < 12) {
			return "Good Morning :: "+user;
		} else if (hour < 16) {
			return "Good Afternoon :: "+user;
		} else if(hour < 20) {
			return "Good Evening :: "+user;
		} else {
			return "Good Night :: "+user;
		}
	}


	@Override
	public String toString() {
		return "WishMsgGenerator [date=" + date + "]";
	}
	
	

}
