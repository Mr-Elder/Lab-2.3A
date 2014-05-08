/**
 * @(#)Lab2_3A.java
 *
 *
 * @author 
 * @version 1.00 2004/6/15
 */

import java.text.*;

public class Lab2_3A {
    
    public static void main(String[] args)
    {
    	final double PI = 3.14159;
		int radius, radius2;
		
		double circumference, area, circumference2, area2, factorChangeArea, factorChangeCirc;

		radius = GetInfo.getInt("Enter the radius of a circle");
		radius2 = radius * 2;
		
		area = PI * radius * radius;
		area2 = PI * radius2 * radius2;
		
		circumference = 2 * (PI * radius);
		circumference2 = 2 * (PI * radius2);
		
		factorChangeArea = area2/area;
		factorChangeCirc = circumference2/circumference;

		GetInfo.showMessage("The area of a circle with a radius of " + radius + " is " + area + "\n" + "The area of a circle with a radius of " + radius2 + " is " + 			area2 + "\n" + "The circumference of a circle with a radius of " + radius + " is " + circumference + "\n" + "The circumference of a circle with a radius of " 			+ radius2 + " is " + circumference2 + "\n" + "The factor change between the 2 areas is " + factorChangeArea + "\nThe factor change between the 2 circumferences is " + factorChangeCirc);
 
    }
}