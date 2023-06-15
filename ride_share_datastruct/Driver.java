/**
*  There is nothing required to do in this class. 
*/
public class Driver extends User {

	private Driveable vehicle;
	
	public Driver() {
		super();
	}

	public Driver(Driveable vehicle) {
		super();
		this.vehicle = vehicle;
	}

	public void drive() {
		this.vehicle.drive();
	}

	public Driveable getVehicle() {
		return vehicle;
	}

	public void setVehicle(Driveable vehicle) {
		this.vehicle = vehicle;
	}

}
