
public class Student {
	private String firstName;
	private String lastName;
	private String nickName;
	private String major;
	private String minor;
	private String attitude;
	
	public Student() {
	}
	
	public Student(String lastName) {
		this("n/a", lastName, "n/a", "n/a", "n/a", "n/a");
	}
	
	public Student(String firstName, String lastName) {
		this(firstName, lastName, "n/a", "n/a", "n/a", "n/a");
		
	}
	
	Student x = new StudentBuilder()
			.setFirstName("Bob")
			.setLastName("Smith")
			.createStudent();
	
	
	
		
	

	public Student(String firstName, String lastName, String nickName, String major, String minor, String attitude) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.major = major;
		this.minor = minor;
		this.attitude = attitude;
	}






	public String getFirstName() {
		return firstName;
	}





	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}





	public String getLastName() {
		return lastName;
	}





	public void setLastName(String lastName) {
		this.lastName = lastName;
	}





	public String getNickName() {
		return nickName;
	}





	public void setNickName(String nickName) {
		this.nickName = nickName;
	}





	public String getMajor() {
		return major;
	}





	public void setMajor(String major) {
		this.major = major;
	}





	public String getMinor() {
		return minor;
	}





	public void setMinor(String minor) {
		this.minor = minor;
	}





	public String getAttitude() {
		return attitude;
	}





	public void setAttitude(String attitude) {
		this.attitude = attitude;
	}





	public static void main(String[] args) {
		Student s = new Student();
		
		Student s1 = new Student("Smith", "Bob");
		

	}

}
