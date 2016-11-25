
public class Employee implements Comparable<Employee>

{

	private String Id;
	
	private String lastName;
	
	private String firstName;



	public int compareTo(Employee emp)

	{
	
	int compLasts = lastName.compareTo(emp.lastName);

		int compFirsts = firstName.compareTo(emp.firstName);

		int compId = Id.compareTo(emp.Id);


		if ((compId != 0) && (compLasts != 0) && (compFirsts != 0))

		{
			
			return compLasts;

		}
	
	else
		
{


			throw new IllegalArgumentException("Empolyee already exists with that Id.");

		}
	
}



	public Employee (String socialSN, String ln, String fn)

	{
		ssn = socialSN;

		lastName = ln;

		firstName = fn;

	}


	public String toString()
	
{

		return "Employee[Id= " + Id + ", Last Name= " + lastName + ", First Name= " + firstName + "]";

	}


	public String getLastName()

	{

		return lastName;

	}


	public String getFirstName()

	{
	
	return firstName;

	}

	
public String getId()
	
{

		return Id;

	}

	
public void setLastName(String setLN)

	{

		lastName = setLN;

	}

	
public void setFirstName(String setFN)
	
{

		firstName = setFN;


	}

	
public void setSSN(String setId)
	
{
		
Id = setId;

	}

}
