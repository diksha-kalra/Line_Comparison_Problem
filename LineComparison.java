package com.linecomparision; 
import java.text.DecimalFormat;

public class LineComparison {
	
	public static void main(String[] args) {
		
		//Printing welcome message
		System.out.println("Welcome to Line Comparision Computation Program");
		
		//Variable declaration
		int x1,x2,y1,y2; // points of line1 (x1,y1) and (x2,y2)
		Double length_1,length_2; 
		int x3,x4,y3,y4; // points of line2 (x3,y3) and (x4,y4)
		
		//rounding off to two decimal places
		DecimalFormat df = new DecimalFormat("##.##");
			    
		//Generating random values for line1 coordinates
		x1=(int)(Math.floor(Math.random()*10));
		x2=(int)(Math.floor(Math.random()*10));
		y1=(int)(Math.floor(Math.random()*10));
		y2=(int)(Math.floor(Math.random()*10));
			    
		//Length of line 1
		length_1=(Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));	 	    
		System.out.println("length of a line 1 "+df.format(length_1));
		        
		//Generating random values for line2 coordinates
		x3=(int)(Math.floor(Math.random()*10));
		x4=(int)(Math.floor(Math.random()*10));
		y3=(int)(Math.floor(Math.random()*10));
	        y4=(int)(Math.floor(Math.random()*10));
							    
	        //Length of line 2
	        length_2=(Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3)));	 	    
                System.out.println("length of a line 2 "+df.format(length_2));
        	    
              	//Checking equality of two lines using compareTo equals method
                Double obj3=new Double(length_1);
                Double obj4=new Double(length_2);
                int value=obj3.compareTo(obj4);
                
		if(value==0) {
                	System.out.println("Both lines are equal");
                }
                else if(value>0) {
                	System.out.println("Length of Line 1 greater than Line 2");
                }
                else {
                	System.out.println("Length of Line 1 less than Line 2");
                }
	}
}