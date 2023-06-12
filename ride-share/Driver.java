public class Driver extends User {

	private Driveable vehicle;

	public Driver() {
	}

	public Driver(Driveable vehicle) {
		this.vehicle = vehicle;
	}

	public void drive() {
		if (vehicle != null) {
			vehicle.drive();
		}
	}

	public Driveable getVehicle() {
		return vehicle;
	}

	public void setVehicle(Driveable vehicle) {
		this.vehicle = vehicle;
	}
}