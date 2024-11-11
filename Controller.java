/**
* Controller
*/


package appdata;








import javafx.scene.control.*;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;









/**
*
*/
public class Controller {
	
	
	
	/**
	 * @params
	 */
	
	/**
	 * Username filed
	 */
	
	@FXML
	private TextField usrnm;
	
	
	
	/**
	 * Password filed
	 */
	
	@FXML
	private PasswordField psswrd;
	
	
	/**
	 * Output label
	 */
	
	@FXML
	private Label _output_;
	
	
	/**
	 * Check box
	 */
	
	@FXML
	private CheckBox check_box;
	
	
	
	
	
	
	
	
	/**
	 * Connect to the database
	 */
	private Database database = new Database();
	
	
	
	
	
	
	
	
	/**
	 * Login button functionality
	 */
	public void lgn(ActionEvent actn_evnt) {
		//check if the username is correct and its in the database
		if(database.get_users_data().containsKey(usrnm.getText())) {
			//check if the password is correct
			if(database.get_users_data().get(usrnm.getText()).equals(String.valueOf(psswrd.getText()))) {
				//Check if the user agree with the terms
				if(check_box.isSelected()) {
					_output_.setText("Redictering ...");
				}else {
					usrnm.setEditable(false);
					psswrd.setEditable(false);
					check_box.setDisable(true);
					check_box.setTextFill(Color.RED);
					_output_.setText("Agree with the terms!");
					_output_.setTextFill(Color.RED);
				}
			}else {
				check_box.setDisable(true);
				usrnm.setEditable(false);
				psswrd.setEditable(false);
				psswrd.setBorder(Border.stroke(Color.RED));
				_output_.setTextFill(Color.RED);
				_output_.setText("Wrong password!");
			}			
		}else {
			check_box.setDisable(true);
			psswrd.setEditable(false);
			usrnm.setEditable(false);
			usrnm.setBorder(Border.stroke(Color.RED));
			_output_.setTextFill(Color.RED);
			_output_.setText("User not found!");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	/**
	 * Reset button functionality
	 */
	public void rst(ActionEvent actn_evnt) {
		//reset the username
		usrnm.setText("");
		usrnm.setBorder(null);
		usrnm.setEditable(true);
		
		//reset the password
		psswrd.setText("");
		psswrd.setBorder(null);
		psswrd.setEditable(true);
		
		//reset the output label
		_output_.setTextFill(Color.WHITE);
		_output_.setText("");
		
		//reset the check box
		check_box.setSelected(false);
		check_box.setTextFill(Color.WHITE);
		check_box.setDisable(false);
	}
	
	
}
