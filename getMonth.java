/**
	 *	this method chooses a month based on what number they pass
	 */
	public static String getMonth(int n)
	{
		//String that stores each month of the year
		String months = "January February March April May June "
				+ "July August September October November December ";

    	//loops 12 times (the amount of months in a year)
		for (int i = 1; i <= 12; i++)
		{
			//terrible naming. finds the index of the first space and stores it
			int sL = months.indexOf(' ');

    		//checks if the number passed (n) is the same as the value of i
			if (n == i)
			{
        		//returns the month selected by the user. breaks the loop
				return months.substring(0, sL);
			}
			
      		//if the check is false, guts the month from the string and modifies it
			else
			{
        		//changes the value of the String made at the beginning
				months = months.substring(sL + 1);
			}
		}
		//returns a default string if the user inputted > 12
		return " /* What String would you put here? */ ";
		
	}
