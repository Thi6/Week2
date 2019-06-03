package models;

public class Motorcycle extends Vehicle implements Cloneable{

	public Motorcycle(Double height, int noOfSeats, int noOfWheels) {
		super(height, noOfSeats, noOfWheels);
	}
	
	@Override
	public Vehicle clone() throws CloneNotSupportedException {
		return (Motorcycle) super.clone();
	}
}
