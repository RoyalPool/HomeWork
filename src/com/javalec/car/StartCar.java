package com.javalec.car;

public abstract class StartCar {
	public String tire;
	public String color;
	public String handle;
	public int displacement;

	public StartCar(String tire, String color, String handle, int displacement) {
		this.tire=tire;
		this.color=color;
		this.handle=handle;
		this.displacement=displacement;
	
	}
	
	public abstract void CarSpec();
}
