package com.brekol.srm723.div2;

public class BuffaloBuffalo {

	public String check(String s) {

		final String[] buffalo = s.split("buffalo");
		if(buffalo.length ==0 || !buffalo[0].equals("")){
			return "Not good";
		}
		for (int i = 1; i < buffalo.length; i++) {
			if(!buffalo[i].equals(" ")){
				return "Not good";
			}
		}

		return "Good";
	}
}
