
/**
 * DOG (but puppy)
 * @author Keola :)
 */
public class PuppyDog extends Dog
{
	/* CLASS ATTRIBUTES */
	private boolean isFed;
	
	/**
	 * CONSTRUCTOR
	 * @param age
	 * @param name
	 * @param isAdopted
	 * @param isFed
	 */
	public PuppyDog(int age, String name, boolean isAdopted, boolean isFed)
	{
		super(age, name, isAdopted);
		this.isFed = isFed;
	}
	
	/**
	 * states the age of the dog in months
	 */
	@Override
	public void stateAge()
	{
		System.out.println(name + " is " + age + " months old");
	}
	
	/**
	 * switchhes isFed to true
	 */
	public void feedPup()
	{
		isFed = true;
	}
	
	/**
	 * increments age and resets isFed
	 */
	@Override
	public void increaseAge()
	{
		super.increaseAge();
		isFed = false;
	}
	
	/**
	 * method to compare attributes
	 * @param puppy
	 * @return
	 */
	public boolean equals(PuppyDog puppy)
	{
		if (super.equals(puppy) && this.isFed == puppy.isFed) // calls super class equals method
			return true;
		
		return false;
	}
	
	/**
	 * makes it so printing the object doesn't print the hashcode
	 */
	@Override
	public String toString()
	{
		if (isFed)
			return super.toString() + "\nI am fed :D";
		return super.toString() + "\nPlease feed me. They are abusing me :(";
	}
}
