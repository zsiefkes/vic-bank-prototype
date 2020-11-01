import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UserInterface extends Application {
	
	// class names 
	private static final String CTA_BUTTON_CLASS = "cta-button" ;
	private static final String LOGIN_BUTTON_CLASS = "login-button" ;
	
	// JavaFX nodes
	Text header;
	Button saveButton;
	Button borrowButton;
	Button insureButton;
	Button loginButton;
	GridPane welcomePane;
	Scene welcomeScene;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		header = new Text("Welcome to VicBank");
		loginButton = new Button("Log In");
		saveButton = new Button("Save");
		borrowButton = new Button("Borrow");
		insureButton = new Button("Insure");
		loginButton.setId(LOGIN_BUTTON_CLASS);
		saveButton.getStyleClass().add(CTA_BUTTON_CLASS);
		borrowButton.getStyleClass().add(CTA_BUTTON_CLASS);
		insureButton.getStyleClass().add(CTA_BUTTON_CLASS);
		
		welcomePane = new GridPane();
		welcomePane.setId("welcome-pane");
		welcomePane.setMinSize(600, 400);
		welcomePane.setPadding(new Insets(50, 50, 50, 50));
		welcomePane.setVgap(50); 
		welcomePane.setHgap(50);
		welcomePane.setAlignment(Pos.CENTER); 

		
		welcomePane.add(loginButton, 3, 1);
		welcomePane.add(header, 2, 2);
		welcomePane.add(borrowButton, 1, 3);
		welcomePane.add(saveButton, 2, 3);
		welcomePane.add(insureButton, 3, 3);
		
		welcomeScene = new Scene(welcomePane, 600, 400);
		welcomeScene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		
		primaryStage.setTitle("Victoria Bank");
		primaryStage.setScene(welcomeScene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
