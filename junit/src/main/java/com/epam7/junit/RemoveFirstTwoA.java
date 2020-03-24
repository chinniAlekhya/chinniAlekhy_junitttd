package com.epam7.junit;

public class RemoveFirstTwoA {

	public String removea(String string) {
		// TODO Auto-generated method stub
		String result = "";
		if(string.length()>=1 && string.charAt(0) != 'A') {
			result += string.charAt(0);
		}
		if(string.length()>=2 && string.charAt(1) != 'A') {
			result += string.charAt(1);
		}
		if(string.length()>2) {
		result += string.substring(2);
		}
		return result;
	}

}
