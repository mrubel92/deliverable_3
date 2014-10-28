package com.bdd.stringmodify;

public class StringModify
{
	public String theString;

	public StringModify(String str)
	{
		theString = str;
	}
	public void reverse()
	{
		theString = new StringBuilder(theString).reverse().toString();
	}
	
	public void remove(int chars)
	{
		int length = theString.length();
		if(chars > length || length < 0)
		{
			theString = "ERROR";
		}
		theString = theString.substring(0, length-chars);
	}
	
	public void add(String add)
	{
		theString = theString + add;
	}
	
	public String getString()
	{
		return theString;
	}

}
