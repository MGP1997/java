<<<<<<< HEAD
package sub05;

import sub02.Car;

public class Truck extends Car{

	private int capacity; // 적재용량
	
	public Truck(String name, String color, int capacity) {
	super(name, color, speed);	 
	this.capacity = capacity;
	}
	
	public void load(int capacity) {
		this.capacity += capacity;
	}
	
	public void show() {
		super.show();
		System.out.println("현재 적재량 : " + this.capacity);
		
	}
	
}
=======
package sub05;

import sub02.Car;

public class Truck extends Car{

	private int capacity; // 적재용량
	
	public Truck(String name, String color, int capacity) {
	super(name, color, speed);	 
	this.capacity = capacity;
	}
	
	public void load(int capacity) {
		this.capacity += capacity;
	}
	
	public void show() {
		super.show();
		System.out.println("현재 적재량 : " + this.capacity);
		
	}
	
}
>>>>>>> 9a6cf6a676fcd15d59c76a2fb238cddbd4e57082
