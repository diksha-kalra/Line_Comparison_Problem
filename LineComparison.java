package com.linecomparision; 
import java.text.DecimalFormat;

public class LineComparison {
	
	public static void main(String[] args) {
		
		//Printing welcome message
		System.out.println("Welcome to Line Comparision Computation Program");
		//Variable declaration
		int x1,x2,y1,y2; // points of line (x1,y1) and (x2,y2)
		Double length; 
		
		//rounding off to two decimal places
		DecimalFormat df = new DecimalFormat("##.##");
		
		//Generating random values for line coordinates
		x1=(int)(Math.floor(Math.random()*10));
		x2=(int)(Math.floor(Math.random()*10));
		y1=(int)(Math.floor(Math.random()*10));
		y2=(int)(Math.floor(Math.random()*10));
		
		//Length of a line
		length=(Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));	 	    
		System.out.println("length of a line 1 "+df.format(length));
	}
}