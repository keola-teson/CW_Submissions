//this code does problems my teacher gave to us. I (Keola) made this :sunglasses:
package work;

public class Non_Void_Method_Practice {

	public static void main(String[] args) {

//task 1: prints my name, my hair style, and my favorite food
System.out.println(stateName());		
System.out.println(stateHairStyle());
System.out.println(stateFavoriteFood());
System.out.println(" ");

//task 2: prints circle stats
//declare variables
double radius;
double diameter;
double circ;
double area;

//sets value
radius = 2.0;
diameter = calcDiameter(radius);
circ = calcCircumference(radius);
area = calcArea(radius);

//print statements
System.out.print("The diameter of a circle with the radius " + radius + " is " + diameter + ". ");
System.out.print("The circumference is " + circ + ". ");
System.out.println("The area is " + area + ". ");
System.out.println("I'm the best :sunglasses:");
System.out.println(" ");

//task 3: prints math stuffs
//declare variables
int num1;
int num2;
int add;
int sub;
int mult;
int div;
int mod;

//sets value
num1 = 5;
num2 = 2;
add = doAdd(num1, num2);
sub = doSub(num1, num2);
mult = doMult(num1, num2);
div = doDiv(num1, num2);
mod = doMod(num1, num2);

//print statements
System.out.println("" + num1 + " + " + num2 + " = " + add);
System.out.println("" + num1 + " - " + num2 + " = " + sub);
System.out.println("" + num1 + " * " + num2 + " = " + mult);
System.out.println("" + num1 + " / " + num2 + " = " + div);
System.out.println("" + num1 + " % " + num2 + " = " + mod);

//--------------------------------------------------------------------------------


	}
/**
 * Task 1: This method states my name
 */
	
public static String stateName()
{
	return("My name is Keola, and I'm the fweakin best.");
}

/**
 * This method states my eye color
 */

public static String stateEyeColor()
{
	return("I have brown eyes. 0.0");
}

/**
 * This method states my hair style
 */

public static String stateHairStyle()
{
	return("I have a mullet. Mullet gang.");
}

/**
 * This method states my best fwiend
 */

public static String stateBestFriend()
{
	return("My best friend is my girlfriend Lyzelle (screw ella).");
}

/**
 * This method states my favorite food
 */

public static String stateFavoriteFood()
{
	return("My favorite food is Raising Cane's chicken with the Cane's sauce.");
}


/**
 * Task 2: This method returns circle stats
 */

public static double calcDiameter(double radius)
{
	return(2 * radius);
}

public static double calcCircumference(double radius)
{
	final double pi = 3.14;
	return(2 * pi * radius);
}

public static double calcArea(double radius)
{
	final double pi = 3.14;
	return(pi * radius * radius);
}


/**
 * Task 3: These next methods do a bunch of math: add, subtract, multiply, divide, and modulo
 */

public static int doAdd(int num1, int num2)
{
	//adds num1 and num2
		int add = num1 + num2;
		return add;
}

public static int doSub(int num1, int num2)
{
	//subtracts num1 and num2
		int sub = num1 + num2;
		return sub;
}

public static int doMult(int num1, int num2)
{
	//multiplies num1 and num2
		int mult = num1 * num2;
		return mult;
}

public static int doDiv(int num1, int num2)
{
	//divides num1 and num2
		int div = num1 / num2;
		return div;
}

public static int doMod(int num1, int num2)
{
	//finds mod of num1 and num2
		int mod = num1 % num2;
		return mod;
}

}
