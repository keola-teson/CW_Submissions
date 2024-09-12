//this code does problems my teacher gave to us. I (Keola) made this :sunglasses:
public class Methods_Intro_Practice_CW {

	public static void main(String[] args) {

//task 1
stateName();		
stateHairStyle();
stateFavoriteFood();
System.out.println(" ");

//task 2
printCircleStats(2);
System.out.println(" ");

//task 3
//change the two numbers in the ():
printMathStuffs(1, 1);

//--------------------------------------------------------------------------------

	}
/**
 * Task 1: This method states my name
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

/**
 * Task 2: This method prints circle stats
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
	System.out.println("I'm the best :sunglasses:");
}


/**
 * Task 3: This method does a bunch of math
 */

public static void printMathStuffs(int num1, int num2)
{
	//adds the two, prints, then reset's the variable
		num1 += num2;
		System.out.println(num1);
		num1 -= num2;
		
	//subtracts the two, prints, then reset's the variable
		num1 -= num2;
		System.out.println(num1);
		num1 += num2;
		
	//multiplies the two, prints, then reset's the variable
		num1 *= num2;
		System.out.println(num1);
		num1 /= num2;
		
	//divides the two, prints, then reset's the variable
		num1 /= num2;
		System.out.println(num1);
		num1 *= num2;
		
	//finds the remainder of the two
		int mod = num1 % num2;
		System.out.println(mod);
}

}
