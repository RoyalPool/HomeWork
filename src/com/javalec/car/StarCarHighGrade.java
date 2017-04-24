package com.javalec.car;

public class StarCarHighGrade extends StartCar{

	public StarCarHighGrade(String tire, String color, String handle, int displacement ) {
		super(tire,color,handle,displacement);	
	}
	
	int tax=1000;
	
	public void CarSpec() {
	
		System.out.println("*****************");
		System.out.println("타이어 :"+tire);
		System.out.println("색상:"+color);
		System.out.println("핸들:"+handle);
		System.out.println("배기량:"+displacement);
		
		if(displacement>2000) tax=1500;
			
		System.out.println("***************");
		System.out.println("세금 : "+tax);
	}
	
}
