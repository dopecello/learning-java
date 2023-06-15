import java.util.Set;

/**
 *	Domain object for a ride in our taxi service
 *  There is nothing required to do in this class. 
 */
public class Ride {

	private Driver driver;
	private Set<Passenger> passengers;
	private boolean completed;
	
	public Ride() {
		super();
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Set<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(Set<Passenger> passengers) {
		this.passengers = passengers;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

}
