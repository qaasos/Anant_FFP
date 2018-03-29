package com.asos.practice;

public class rectangle {
	
	
	static double length;
	static double breadth;
	
	
	public static double GetArea()
	{
		return (length * breadth);
	}
	
	void display()
	{
		System.out.println("Area of Rectangle" + GetArea());
	}
	
	
		
}