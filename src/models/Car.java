package models;

public class Car extends Vehicle implements Cloneable{

	private int noOfDoors;

	public Car(double height, int noOfSeats, int noOfWheels, int noOfDoors) {
		super(height, noOfSeats, noOfWheels);
		this.noOfDoors = noOfDoors;

	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	
	@Override
	public Vehicle clone() throws CloneNotSupportedException {
		return (Car) super.clone();
	}
}
