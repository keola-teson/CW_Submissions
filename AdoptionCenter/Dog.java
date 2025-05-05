
/**
 * DOG
 * @author Keola :)
 */
public class Dog
{
	/* CLASS ATTRIBUTES */
	protected boolean isAdopted;
	protected int age;
	protected String name;
	
	/**
	 * CONSTRUCTOR
	 * @param isAdopted
	 * @param age
	 * @param name
	 */
	public Dog(int age, String name, boolean isAdopted)
	{
		this.isAdopted = isAdopted;
		this.age = age;
		this.name = name;
	}
	
	/**
	 * GETTER
	 * @return isAdopted
	 */
	public boolean getAdoptionStatus()
	{
		return isAdopted;
	}
	
	/**
	 * prints the age of the dog
	 */
	public void stateAge()
	{
		System.out.println(name + " is " + age + " years old.");
	}
	
	/**
	 * increments age
	 */
	public void increaseAge()
	{
		age++;
	}
	
	/**
	 * checks if the attributes of the passed dog are the same as the attributes of the current dog instance
	 * @param dog
	 * @return
	 */
	public boolean equals(Dog dog)
	{
		if (this.age == dog.age && this.name.equals(dog.name) && this.isAdopted == dog.isAdopted)
			return true;
		
		return false;
	}
	
	/**
	 * returns age and adoption status of dog when obj is printedd
	 */
	@Override
	public String toString()
	{
		stateAge();
		
		if (isAdopted)
		{
			return "I have been adopted!!";
		}
		return "I haven't been adopted yet, but I am excited about meeting a new family!";
	}
}
