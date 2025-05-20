/*
 * This code takes the radius of a sphere and calculates the surface area and volume from it. I hope
 * this made by me (keola) :]
 */
package work;

public class Intro_Sphere {

	public static void main(String[] args) {

//declare the variables
double radius;
final double pi = 3.14;
final double volumeequ = (double)4/3;

//sets the value
radius = 2;

//calculates SA of a cube
double surfaceArea = 4 * pi * radius * radius;

//calculates volume
double volume = volumeequ * pi * radius * radius * radius;

//prints into console
System.out.print("The surface area of a sphere with the radius " + (int)radius + " is ");
System.out.println(+ (int)surfaceArea + ", and the volume is " + (int)volume + ".");
System.out.print("I'm the best :sunglasses:");

		
		
		
	}

}
