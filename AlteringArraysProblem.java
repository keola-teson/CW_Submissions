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
	
	public static int[] subtract5FromAll4(int[] arr)
	{
		int[] copy = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++)
		{
			copy[i] = arr[i] - 5;
		}
		
		return copy;
	}

}
