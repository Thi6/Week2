package models;
import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> garageList = new ArrayList<Vehicle>();

	public void calculateBill(ArrayList<Vehicle> garageList) {
		double theTotal = 0;
		for (Vehicle vehic : garageList) {
			if (vehic instanceof Car) {
				theTotal = vehic.getHeight() * 5 + vehic.getNoOfSeats() * 2;
				System.out.println("Your total bill is  " + theTotal);

			} else if (vehic instanceof Bus) {
				theTotal = vehic.getHeight() * 10 + vehic.getNoOfSeats() * 2 + ((Bus) vehic).getCapacity();
				System.out.println("Your total bill is " + theTotal);
			} else if (vehic instanceof Motorcycle) {
				theTotal = vehic.getHeight() * 5;
				System.out.println("Your total bill is " + theTotal);
			}

		}
	}

	public void addVehicle(Vehicle aVehicle) {
		garageList.add(aVehicle);
	}

	public void removeAVehicle(Vehicle aVehicle) {
		// removes a certain vehicle from the garage
		garageList.remove(aVehicle);
	}

	public void removeVehicles(String typeOfVehicle) {
		// removes a certain type of vehicle from the garage
		int carCount = 0;

		for (Vehicle vehic : garageList) {
			if (vehic instanceof Car) {
				carCount++;
			}

		}
	}

	public ArrayList<Vehicle> getGarageList() {
		return garageList;
	}

	public void setGarageList(ArrayList<Vehicle> garageList) {
		this.garageList = garageList;
	}

}
