/**
* GitHub login form in JavaFX
*   ControlPanel
*/


package appdata;







import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;







/**
 * 
 */
public class Main extends Application {

	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) { launch(args); }
	
	
	
	
	
	
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(Main.class.getResource("form.fxml"));
		Scene scn = new Scene(root);
		
		scn.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		
		arg0.setTitle("Login");
		arg0.setScene(scn);
		arg0.setResizable(false);
		arg0.show();
	}
	
	
	
	
	
}


















