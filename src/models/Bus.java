package models;

public class Bus extends Vehicle implements Cloneable{
	private int capacity;

	public Bus(Double height, int noOfSeats, int noOfWheels, int capacity) {
		super(height, noOfSeats, noOfWheels);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	@Override
	public Vehicle clone() throws CloneNotSupportedException {
		return (Bus) super.clone();
	}

}
