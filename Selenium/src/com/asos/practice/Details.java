package com.asos.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Details {
	
	int x;
	private ChromeDriverService options;
	
	public Details(int x)
	{
		this.x = x;
	}
	
	public static void main(String[] args){
		
		
		Details D1, D2, D3, D4;
		
		D1 = new Details(56);
		D2 = new Details(2);
		D3 = new Details(78);
		D4 = new Details(66);
		
		
		
		List<Details> L1 = new ArrayList<Details>();
		
		L1.add(D1);
		L1.add(D2);
		L1.add(D3);
		L1.add(2,D1);
		L1.add(D4);
		
		for(Details xyz : L1)
		{
			System.out.println(xyz.x);
		}
		
		
		L1.remove(D1);
		
		
		
		for(Details xyz : L1)
		{
			System.out.println(xyz.x);
		}
		
	}
	
	

}











