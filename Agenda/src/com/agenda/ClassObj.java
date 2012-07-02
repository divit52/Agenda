package com.agenda;

public class ClassObj {
	private int credits;
	private String className;
	
	public ClassObj(int credits, String className)
	{
		this.credits = credits;
		this.className = className;
	}
	
	public void setCredits(int credits)
	{
		this.credits = credits;
	}
	
	public int getCredits()
	{
		return credits;
	}
	
	public void setClassName(String className)
	{
		this.className = className;
	}
	
	public String getClassName()
	{
		return className;
	}
}


