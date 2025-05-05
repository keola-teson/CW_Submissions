
/**
 * Creates records to log the dog records
 * @author Keola :)
 */
public class AdoptionMain
{
	public static void main(String[] args)
	{
		Dog puppyDog = new PuppyDog(5, "Dog", false, false); // reference obj
		Dog puppyDawg = new PuppyDog(5, "Dog", false, false); // copy obj
		
		System.out.println(puppyDog.equals(puppyDawg)); // example in class
	}
}
