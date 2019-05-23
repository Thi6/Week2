
public class Vehicle {
	private double height;
	private int noOfSeats;
	private int noOfWheels;

	public Vehicle(double height, int noOfSeats, int noOfWheels) {
		this.height = height;
		this.noOfSeats = noOfSeats;
		this.noOfWheels = noOfWheels;
	}

	public String toString() {
		return height + " " + noOfSeats + " " + noOfWheels;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

}
