/**
 * module LoginForm
 */



/**
 * 
 */
module GitHubLoginForm {
	
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens appdata to javafx.graphics, javafx.fxml;
	
}
