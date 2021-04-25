package oopIntroHomework;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,2,"Mert","ciklamert@gmail.com",12,"123456");
		Course javaCourse = new Course(2,"Java-React","Nitelikli Yazılımcı Geliştirici Kampı JAVA-React");
		UserManager userManager = new UserManager();
		userManager.Register(user1);
		userManager.Login(user1);
		userManager.Attendance(user1);

	}

}
