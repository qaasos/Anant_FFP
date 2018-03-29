package com.asos.practice;

import java.util.Scanner;

class Square extends rectangle  {
	
	public static double GetArea(int length,int breadth){
		
		return (length*length);
		
		
		}
	
	
	public double GetArea(double length){
		return (length*length);
	}
	
	public static void main (String[] args){
		
		int Length;
		int Area;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter length of Square");
		length = sc.nextInt();	
		System.out.println("Eneter breadth of Square");
		breadth = sc.nextInt();	
		Square S1= new Square();

				System.out.println("Area of square is =" + S1.GetArea(length));
				
				System.out.println("Area of Rectangle" + GetArea());
	}
	
	

}
