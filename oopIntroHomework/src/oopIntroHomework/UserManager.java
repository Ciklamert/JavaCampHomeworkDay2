package oopIntroHomework;

public class UserManager {
	
	public void Register(User user) {
		System.out.println("Your email : " + user.email + " and password : " + user.password + ". You have been succesfully registered." );
	}
	
	public void Login(User user) {
		System.out.println("Hello " + user.name);
	}
	
	public void Attendance(User user) {
		user.successRate = user.successRate + 6;
		System.out.println("Your success rate is " + user.successRate);
	}
	
}
