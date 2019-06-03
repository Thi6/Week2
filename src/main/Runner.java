package main;

import models.Bus;
import models.Car;
import models.Garage;
import models.Motorcycle;

public class Runner {

	public static void main(String[] args) throws CloneNotSupportedException {

		// creating vehicle
		Car vehicle1 = new Car(1.2, 5, 4, 2);
		Motorcycle vehicle2 = new Motorcycle(0.8, 2, 2);
		Bus vehicle3 = new Bus(2.8, 100, 4, 110);
		Bus vehicle4 = new Bus(2.8, 80, 4, 100);
/*		Bus vehicle5 = new Bus(2.8, 80, 4, 100);
		Bus vehicle6 = new Bus(2.8, 80, 4, 100);
*/
		
		//cloning
		Bus vehicle5 = (Bus) vehicle4.clone();
		vehicle5.setCapacity(10);
		Bus vehicle6 = (Bus) vehicle3.clone();
		vehicle6.setHeight(3);
		
		
		// create a garage
		Garage garage1 = new Garage();

		// add vehicle into garage
		/*
		 * garage1.getGarageList().add(vehicle1); garage1.getGarageList().add(vehicle2);
		 * garage1.getGarageList().add(vehicle3);
		 */

		garage1.addVehicle(vehicle1);
		garage1.addVehicle(vehicle2);
		garage1.addVehicle(vehicle3);
		garage1.addVehicle(vehicle4);

		garage1.addVehicle(vehicle5);
		garage1.addVehicle(vehicle6);
		System.out.println(garage1.getGarageList());

		garage1.calculateBill(garage1.getGarageList());
		// garage1.removeAVehicle(vehicle1);
		// garage1.removeVehicles("bus");
		System.out.println(garage1.getGarageList());
		
		
	}
	

}
