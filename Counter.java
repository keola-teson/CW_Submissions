package work;

public class Counter
{

	public static void main(String[] args)
	{	
		String sentence = "They locked me in a room.";
		String uniqueCharacters = "";
		String uniqueNonLetters = "";
		String uniqueLetters = "";
		int charCount = 0;
		int letterCount = 0;
		int spaceCount = 0;
		int nonLetterCount = 0;
		int uniqueNonLetterCount = 0;
		int uniqueCharCount = 0;
		
		for (int i = 0; i < sentence.length(); i++)
		{
			charCount++;
			letterCount++;
			
			int f = 33;
			while (f < 64)
			{
				if (sentence.substring(i, i + 1).indexOf(f) != -1)
				{
					letterCount--;
					nonLetterCount++;
					break;
				}
				f++;
			}
			
		}
		
		for (int i = 0; i < sentence.length(); i++)
		{
			if (sentence.charAt(i) == ' ')
			{
				letterCount--;
				spaceCount++;
			}
		}
		
		for (int i = 0; i < sentence.length(); i++)
		{
			if (uniqueCharacters.indexOf(sentence.charAt(i)) == -1)
			{
				uniqueCharCount++;
				uniqueCharacters += sentence.charAt(i) + " ";
			}
			
			for (int c = 33; c < 64; c++)
			{
				if (uniqueNonLetters.indexOf(sentence.charAt(i)) == -1 && sentence.charAt(i) == (char)c)
				{
					uniqueNonLetterCount++;
					uniqueNonLetters += sentence.charAt(i) + " ";
				}
				
				if (uniqueCharacters.indexOf(c) != -1)
				{
					uniqueLetters = 
								uniqueCharacters.substring(0, uniqueCharacters.indexOf(c)) + 
								uniqueCharacters.substring(uniqueCharacters.indexOf(c) + 2);
				}
			}
		}
		
		System.out.println("\"" + sentence + "\"" + "\n----------");
		System.out.println("Charcter count: " + charCount);
		System.out.println("Letter count: " + letterCount);
		System.out.println("Non-Letter count: " + nonLetterCount);
		System.out.println("Space count: " + spaceCount);
		System.out.print("\n");
		
		System.out.println("Unique Letter count: " + (uniqueCharCount - uniqueNonLetterCount));
		System.out.println("Unique Letters: " + uniqueLetters);
		System.out.print("\n");
		
		System.out.println("Unique Non-Letters count: " + uniqueNonLetterCount);
		System.out.println("Unique Non-Letters: " + uniqueNonLetters);
		System.out.print("\n");
		
		System.out.println("Unique Character count: " + (uniqueCharCount + 1));
		System.out.println("Unique Characters: " + uniqueCharacters);
		
		
		
	}

}
