
import java.util.Scanner;

public class UserLogin {

	

	public static void main(String[] args) {
	    
		String aws = "aws";
		String blue = "blue";
		Scanner input = new Scanner(System.in);

	    String username;
	    String password;
	 
	    
	    System.out.println("Please enter username and password");
	    System.out.println("username: ");
	    username = input.next();

	    System.out.println("password: ");
	    password = input.next();

	   

	    if(username.equals(aws) && password.equals(blue)) 
	        System.out.println("Welcome Abdul"); 
	
		 else {
			System.out.println("Sorry wrong username or password! ");
			
			
		 	}
	}
}
