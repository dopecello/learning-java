/**
* Passengers will be stored in a HashSet. To ensure no duplicates can be stored,
* you will need a hashCode and equals method.
*
* Hint: name, email, and accountType could create a nice, unique hash value.
*/
public class Passenger extends User {
	
	// BUSINESS, PERSONAL, etc.
	private String accountType;

	public Passenger() {
		super();
	}

    // Do not delete this constructor.
	public Passenger(String name, String accountType) {
		super();
		this.setName(name);
		this.accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
    	
}
