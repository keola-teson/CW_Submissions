
public class BubbleSort
{
	public static void main(String[] args)
	{
		int[] numbers = createRandomArray(10, 20, 1);
		System.out.println("Original Array: "); printArray(numbers);
		
		bubbleSort(numbers);
		System.out.println("Sorted Array: "); printArray(numbers);
	}
	
	private static int[] createRandomArray(int length, int maximum, int minimum)
	{
		int[] array = new int[length];
		for (int i = 0; i < length; i++)
		{
			array[i] = (int)(Math.random() * maximum + minimum);
		}
		
		return array;
	}
	private static void printArray(int[] array)
	{
		for (int i : array)
		{
			System.out.print(i + " ");
		}
		System.out.println("\b");
	}


  
	private static void swap(int[] array, int index1, int index2)
	{
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	/**
	 * Method to sort the passed array
	 * @param array
	 */
	public static void bubbleSort(int[] array)
	{
		//boolean for while loop
		boolean sorted = false;
		//checks if the array isnt sorted
		while (!sorted)
		{
			//changed to true in case it is
			sorted = true;
			//loops through the array - 1
			for (int i = 0; i < array.length - 1; i++)
			{
				//checks if any two numbers are out of order
				if (array[i] > array[i + 1])
				{
					//swaps them (calles method to swap)
					swap(array, i, i + 1);
					//changes sorted to false to allow the while to loop
					sorted = false;
				}
			}
		}
	}
	
}
