import java.util.ArrayList;

public class ArraysToArrayList
{
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for (int i = 0; i <= 10; i++)
			numbers.add((int)(Math.random() * 10) + 1);
		System.out.println(numbers);
		
		System.out.println(checkFor4(numbers) + "\n");
		
		ridAllFives(numbers);
		System.out.println(numbers + "\n");
		
		bubbleSort(numbers);
		System.out.println(numbers);
	}
	
	/**
	 * Method to check for the first index of 4
	 * @param array
	 * @return the index or -1 if 4 isn't in the array list
	 */
	public static int checkFor4(ArrayList<Integer> array)
	{
		//moves through the array list
		for (int i = 0; i < array.size(); i++)
		{
			//checks if the current element is 4
			if (array.get(i) == 4)
			{
				//returns 4
				return i;
			}
		}
		
		//returns -1 if the loop didn't find any 4
		return -1;
	}
	
	/**
	 * Method to remove all 5 in the array list
	 * @param nums
	 */
	public static void ridAllFives(ArrayList<Integer> nums)
	{
		//moves the array list
		for (int i = 0; i < nums.size(); i++)
		{
			//checks if the current element is 5
			if (nums.get(i) == 5)
			{
				//removes the current element
				nums.remove(i);
				//makes sure the next element in the array list doesn't get skipped
				i--;
			}
		}
	}
	
	/**
	 * Method to sort the array list using bubble sort
	 * @param array
	 */
	public static void bubbleSort(ArrayList<Integer> array)
	{
		//boolean for while loop
		boolean swapped = true;
		//checks if the array isnt sorted
		while (swapped)
		{
			//changed to true in case it is
			swapped = false;
			//loops through the array - 1
			for (int i = 0; i < array.size() - 1; i++)
			{
				//checks if any two numbers are out of order
				if (array.get(i) > array.get(i + 1))
				{
					//swaps them
					array.set(i, array.set(i + 1, array.get(i)));
					//changes sorted to false to allow the while to loop
					swapped = true;
				}
			}
		}
	}
}
