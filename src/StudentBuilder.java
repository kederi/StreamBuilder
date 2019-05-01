
public class StudentBuilder {
	private String firstName = "*";
	private String lastName = "*";
	private String nickName = "*";
	private String major = "*";
	private String minor = "*";
	private String attitude = "*";
	
	public StudentBuilder() 
	{
	}
	
	public StudentBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	
	public StudentBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	
	
	public Student createStudent() {
		return new Student(firstName,
				lastName,
				nickName,
				major,
				minor,
				attitude);
	}
	
	
}
