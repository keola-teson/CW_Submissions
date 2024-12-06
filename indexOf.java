	/**
	 * This method is not static. What does this mean about how the method works? After code tracing, also answer
   * the following question: what does this method do?
   * 
	 * It means that this method relies on data attributes to work. It is object based
   * This method returns the index of the string or a -1 depending on if the if statement is true or false
	 */
	public int doesSomething(char c)
	{
		/*
		 * This line below works even though str was not instantiated in the method.
		 * What conclusion can you draw from this fact?
     * 
		 * str is a data attribute
		 * 
		 * */

		int l = str.length();
		
		/*
		 * Why might executing the loop below result in a syntax error?
		 * 
		 * the length of the string is not a valid index so when it checks it it will return an error
		 * 
		 */
		for (int i = 0; i <= l; i++)
		{
			
			/*
			 * What is this line checking for? What does it return if it is true?
			 * 
			 * it checks for if the iterated char matches the passed char.
       * if it is true, it returns the index of the first instance of that char
       * 
			 */
			if (str.charAt(i) == c)
			{
				return i;
			}
			
		}
		/*
		 * What is the purpose of this line below? 
		 * Think about what needs to happen for it to be reached. 
		 * 
     * purpose: to have a final return statement to end the method
		 * if it there is no instance of the passed char, it simply returns -1
		 */
		return -1;
		
	}
