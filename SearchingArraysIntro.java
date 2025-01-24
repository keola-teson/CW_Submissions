
public class SearchingArraysIntro
{
	public static void main(String[] args)
	{
		int[] array = {1, 2, 4, 4, 4, 5, 6, 4, 8};
		
		System.out.println(checkFor4(array));
		System.out.println(countFor4(array));
		System.out.println(checkForFour4(array));
	}

	/**
	 * Method to check if the array contains an instance of a 4
	 * @param array
	 * @param num
	 * @return a true or false value
	 */
	private static boolean checkFor4(int[] array)
	{
		//safety
		int[] copy = array;
		//variable to return
		boolean isFound = false;
		
		//moves through the array
		for (int i = 0; i < copy.length; i++)
		{
			//check if the current element in the array is a 4
			if (copy[i] == 4)
			{
				//changes isFound to true
				isFound = true;
			}
		}
		
		//returns a true or false
		return isFound;
	}
	
	/**
	 * Method to count the amount of times the number 4 shows up in the array
	 * @param array
	 * @return a count of the amount of times the number 4 shows up
	 */
	private static int countFor4(int[] array)
	{
		//safety
		int[] copy = array;
		//variable to return
		int count = 0;
		
		//moves through the array
		for (int i = 0; i < copy.length; i++)
		{
			//checks if the current element is a 4
			if (copy[i] == 4)
			{
				//adds one to count
				count++;
			}
		}
		
		//returns the amount of times 4 shows up in the passed array
		return count;
	}
	
	/**
	 * Method to check if there are exactly 4 4s in the passed array
	 * @param array
	 * @return true or false
	 */
	private static boolean checkForFour4(int[] array)
	{
		//safety
		int[] copy = array;
		//to check later
		int count = 0;
		//variable to return
		boolean hasFour = false;
		
		//moves through the array
		for (int i = 0; i < copy.length; i++)
		{
			//checks if the current element is 4
			if (copy[i] == 4)
			{
				//adds one to count
				count++;
			}
		}
		
		//checks if count is storing exactly 4
		if (count == 4)
		{
			//switches hasFour
			hasFour = true;
		}
		
		//returns true or false
		return hasFour;
	}
}
