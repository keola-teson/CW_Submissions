import java.util.Arrays;

public class AlteringArrayProblem
{
	public static void main(String[] args)
	{
		int[] nums = {5, 0, 8, 20};
		
		int[] minus5 = subtract5FromAll4(nums);
		
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(minus5));
	}
	
	/**
	 * Method to subtract 5 from passed array
	 * @param arr
	 * @return
	 */
	public static int[] subtract5FromAll4(int[] arr)
	{
		//blank array for safety
		int[] copy = new int[arr.length];
		
		//loops through original array
		for (int i = 0; i < arr.length; i++)
		{
			//changes the current element in the copy to the current element inside of the original array - 5
			copy[i] = arr[i] - 5;
		}
		
		//return copy
		return copy;
	}

}
