//this code does problems my teacher gave to us. I (Keola) made this :sunglasses:
public class Methods_Intro_Practice_CW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//task 1
stateName();		
stateHairStyle();
stateFavoriteFood();
System.out.println(" ");

//task 2
printCircleStats(2);
System.out.println(" ");

//task 3


	}

/*
 * Create a void method called stateName() that prints out your name. 
 * Repeat this task for stateEyeColor(), stateHairStyle(), stateBestFriend(), and stateFavoriteFood(). 
 * Then, call stateName(), stateHairStyle, and stateFavoriteFood().
 */


/**
 * This method states my name
 */
public static void stateName()
{
	System.out.println("My name is Keola, and I'm the fweakin best.");
}
/**
 * This method states my eye color
 */
public static void stateEyeColor()
{
	System.out.println("I have brown eyes. 0.0");
}
/**
 * This method states my hair style
 */
public static void stateHairStyle()
{
	System.out.println("I have a mullet. Mullet gang.");
}
/**
 * This method states my best fwiend
 */
public static void stateBestFriend()
{
	System.out.println("My best friend is my girlfriend Lyzelle (screw ella).");
}
/**
 * This method states my favorite food
 */
public static void stateFavoriteFood()
{
	System.out.println("My favorite food is Raising Cane's chicken with the Cane's sauce.");
}

/*
 * Create a method printCircleStats() that is passed a double (meant to represent a circle's radius) 
 * and calculates then prints out the radius, diameter, circumference, and area of the circle. 
 * Call the method to make sure it works.
 */

/**
 * This method prints circle stats
 */
public static void printCircleStats(double radius)
{
	//declare the variables
	final double pi = 3.14;
	
	//calculates the diameter of a circle
	double diameter = 2 * radius;

	//calculates area of a circle
	double area = pi * radius * radius;

	//calculates circumference of a circle
	double circ = 2 * pi * radius;

	//prints into console
	System.out.print("The diameter of a circle with the radius " + radius + " is "  + diameter + ". ");
	System.out.print("The area is " + area);
	System.out.println(", and the volume is " + circ + ".");
	System.out.print("I'm the best :sunglasses:");
}

/*
 * Create a method printMathStuffs() that is passed two ints and prints their sum, 
 * difference, product, quotient, and the remainder (using modulus) of the first number modulus 
 * the second number. Call it to make sure it works.
 */

/**
 * This method does a bunch of math
 */
public static void printMathStuffs(int num1, int num2)
{
	//declares 
	
	//sets the value of num1 and num2
	num1 = 1;
	num2 = 1;
	
	//does the math stuff
	
}

}
