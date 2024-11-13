/**
* Main database
*/



package appdata;








import java.util.HashMap;









/**
*
*/
public class Database {
	
	
	
	
	/**
	 * Create the database
	 */
	private HashMap<String,String> database = new HashMap<String,String>();
	
	
	
	
	
	
	/**
	 * 
	 */
	Database(){
		
		database.put("Cvetelinm", "1234");
		database.put("Cvetelinmarinov","4321");
		
	}
	
	
	
	
	
	
	
	
	
	/**
	 * Get users data
	 */
	public HashMap<String,String> get_users_data(){ return database; }
	

	/**
	 * toString method
	 */
	public String toString(){ return database.toString(); }
	
	
	
}
