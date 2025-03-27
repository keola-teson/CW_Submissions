
public class Array2DIntro
{
	public static void main(String[] args)
	{
		// 1) Instantiate a 2-D array gridNums that consists of 4 rows and 6 columns using the new keyword. 
		int[][] gridNums = new int[4][6];
		
		/* 
		 * 2) Instantiate a 2-D array with the following values:
		 * 4 5 7
		 * 2 -1 8
		 * 0 1 3
		 */
		int[][] nums2D = {{4, 5, 7}, {2, -1, 8}, {0, 1, 3}};
		
		System.out.println("Initial:");
		printBoard(gridNums);
		System.out.println();
		printBoard(nums2D);
		System.out.println("-----------------------\n");
		
		// 3) For both of those arrays, change the element in the first row, first column to a 17.
		gridNums[0][0] = 17;
		nums2D[0][0] = 17;
		
		// 4) For both of those arrays, change the element in the second row, third column into a 20.
		gridNums[1][2] = 20;
		nums2D[1][2] = 20;
		
		// 5) For both of those arrays, change the last element in the first row to a -5. Accomplish this using .length
		gridNums[0][gridNums[0].length - 1] = -5;
		nums2D[0][nums2D[0].length - 1] = -5;
		
		// 6) For both of those arrays, change the first element in the last row to a -7. Accomplish this using .length
		gridNums[gridNums.length - 1][0] = -7;
		nums2D[nums2D.length - 1][0] = -7;
		
		// 7) For both of those arrays, change the last element in the last row to a -30. Accomplish this using .length
		gridNums[gridNums.length - 1][gridNums[gridNums.length - 1].length - 1] = -30;
		nums2D[nums2D.length - 1][nums2D[nums2D.length - 1].length - 1] = -30;
		
		//-------------------------------------------
		printBoard(gridNums);
		System.out.println();
		printBoard(nums2D);
		System.out.println();
		
		// 8) Create a method that is passed a 2-D array of ints and one by one prints out each element in the first row.
		printFirstRow(gridNums);
		printFirstRow(nums2D);
		
		System.out.println();
		
		// 9) Create a method that is passed a 2-D array of ints and one by one prints out each element in the first column.
		printFirstColumn(gridNums);
		printFirstColumn(nums2D);
		
		System.out.println();
		
		// 10) Create a method that is passed a 2-D array of ints and one by one prints out each element in row-major order.
		printRowMajorOrder(gridNums);
		printRowMajorOrder(nums2D);
		
		System.out.println();
		
		// 11) Create a method that is passed a 2-D array of ints and one by one prints out each element in column-major order.
		printColumnMajorOrder(gridNums);
		printColumnMajorOrder(nums2D);
	}
	
	private static void printBoard(int[][] array2D)
	{
		for (int[] array : array2D)
		{
			System.out.print("[");
			for (int i = 0; i < array.length; i++)
			{
				System.out.print(array[i]);
				if (i < array.length - 1)
				{
					System.out.print(", ");
				}
				
			}
			System.out.print("]");
			System.out.println();
		}
	}
	
	/**
	 * Prints first row
	 * @param array2D
	 */
	public static void printFirstRow(int[][] array2D)
	{
		//loops through the first row and prints each element
		for (int i = 0; i < array2D[0].length; i++)
		{
			System.out.print(array2D[0][i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * Prints first column
	 * @param array2D
	 */
	public static void printFirstColumn(int[][] array2D)
	{
		//loops through each array and prints the first element of each
		for (int i = 0; i < array2D.length; i++)
		{
			System.out.print(array2D[i][0] + " ");
		}
		System.out.println();
	}
	
	/**
	 * Prints in row major order
	 * @param array2D
	 */
	public static void printRowMajorOrder(int[][] array2D)
	{
		//loops through each element in each array and prints them
		for (int[] array : array2D)
		{
			for (int num : array)
			{
				System.out.print(num + " ");
			}
		}
		System.out.println();
	}
	
	/**
	 * Prints in column major order
	 * WHY WAS THIS SO STUPID HARD
	 * @param array2D
	 */
	public static void printColumnMajorOrder(int[][] array2D)
	{
		//loops through each array and prints each element at the current index
		for (int i = 0; i < array2D[0].length; i++)
		{
			for (int j = 0; j < array2D.length; j++)
			{
				System.out.print(array2D[j][i] + " ");
			}
		}
		System.out.println();
	}
}
