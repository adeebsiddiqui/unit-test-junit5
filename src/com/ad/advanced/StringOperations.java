package com.ad.advanced;

public class StringOperations {

	public String concatString(String str1, String str2) {
		if(str1 == null || str2 == null)
			throw new NullPointerException();
		
		return str1 + str2;
	}


	public boolean verifyStartAndEndStringSame(String str, String strSequence) {
		if(str == null || strSequence == null)
			throw new NullPointerException();

		return str.startsWith(strSequence) && str.endsWith(strSequence);
	}
}
