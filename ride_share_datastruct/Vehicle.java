/**
*  There is nothing required to do in this class. 
*/
public class Vehicle implements Driveable{

	private String year;
	private String make;
	private String model;
	private String plateNumber;
	private boolean inTransit;
	
	public Vehicle() {
		super();
	}

	/**
	 * This constructor is required.
	 */
	public Vehicle(String year, String make, String model, String plateNumber, boolean inTransit) {
		super();
		this.year = year;
		this.make = make;
		this.model = model;
		this.plateNumber = plateNumber;
		this.inTransit = inTransit;
	}

	public void drive() {
		this.inTransit = true;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public boolean isInTransit() {
		return inTransit;
	}

	public void setInTransit(boolean inTransit) {
		this.inTransit = inTransit;
	}

}
