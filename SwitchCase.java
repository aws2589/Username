import java.util.Optional;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.control.ChoiceDialog;
import javafx.stage.Stage;

public class SwitchCase extends Application {
	
public enum UserRole {
	Administrator,Staff,Student,Faculty,Guest
}
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		ArrayList<UserRole> choices = new ArrayList<>();
		choices.add(UserRole.Administrator);
		choices.add(UserRole.Staff);
		choices.add(UserRole.Student);
		choices.add(UserRole.Faculty);
		choices.add(UserRole.Guest);
	
		
		ChoiceDialog<UserRole> dialog = new ChoiceDialog<>(UserRole.Student,choices);
		Optional<UserRole> input = dialog.showAndWait();
		UserRole value = input.get();
		
		switch (value) {
		case Administrator:
			System.out.println("Welcome Administrator");
			break;
		case Staff:
			System.out.println("Welcome Staff");
			break;
		case Student:
			System.out.println("Welcome Student");
			break;
		case Faculty:
			System.out.println("Welcome Faculty");
			break;
		case Guest:
			System.out.println("Welcome Guest");
			break;
		default:
			System.out.println("Invalid Option!");
		}
		
		
	}

}
	
