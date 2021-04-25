package oopIntroHomework;

public class User {
	
	public User(int id, int registeredCourseId,String name, String email, int successRate,String password) {
		this.id = id;
		this.registeredCourseId = registeredCourseId;
		this.name = name;
		this.email = email;
		this.successRate = successRate;
		this.password = password;
	}
	
	int id;
	int registeredCourseId;
	String name;
	String email;
	int successRate;
	String password;
}
