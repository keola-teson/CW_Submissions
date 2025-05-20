package work;
public class ArraysIntro
{
	public static void main(String[] args)
	{
		//Task 1: create an empty array for multiple types
		double[] doubArr;
		int[] intArr;
		boolean[] boolArr;
		String[] stringArr;
		Circle[] circArr;
		
		//Task 2: create an int array with hard coded values
		int[] numArr = {7, -12, 88, -88, 0, 5, 2000};
		
		//Task 3: Make a String array with a length of 5
		//default value for String (and all objects) is null
		//default value for int and double is 0(.0)
		//default value for char is null character (U+00000)
		//default value for boolean is false
		String[] fruitsArr = new String[5];
		
		//Task 4: Change second element in the array
		fruitsArr[1] = "Bapple";
		
		//Task 5: Change the last element in the array
		fruitsArr[fruitsArr.length - 1] = "Zanana";
		
		//Task 6: Test if task 4 was done successful
		System.out.println("Task 6:\n--------------\n" + fruitsArr[1]);
		System.out.println();
		
		//Task 7: Print each element in the array
		System.out.println("Task 7:\n--------------");
		for (int i = 0; i < fruitsArr.length; i++)
		{
			System.out.println(fruitsArr[i]);
		}
		System.out.println();
		
		System.out.println(fruitsArr);
	}
}
