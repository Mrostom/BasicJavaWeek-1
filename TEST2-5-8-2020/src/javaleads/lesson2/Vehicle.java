package javaleads.lesson2;

public abstract class Vehicle {

	private String type;
	private int capacity;
	
	public abstract void runVehical( String T, int C);
	
	public void printVehicleDetails(String name, int capacity) {
	}{
		this.type = type;
				this.capacity = capacity;
		System.out.println("type" + type);
		System.out.println("capacity" + capacity);
	}


}