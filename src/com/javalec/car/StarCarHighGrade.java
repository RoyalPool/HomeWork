package com.javalec.car;

public class StarCarHighGrade extends StartCar{

	public StarCarHighGrade(String tire, String color, String handle, int displacement ) {
		super(tire,color,handle,displacement);	
	}
	
	int tax=1000;
	
	public void CarSpec() {
	
		System.out.println("*****************");
		System.out.println("Ÿ�̾� :"+tire);
		System.out.println("����:"+color);
		System.out.println("�ڵ�:"+handle);
		System.out.println("��ⷮ:"+displacement);
		
		if(displacement>2000) tax=1500;
			
		System.out.println("***************");
		System.out.println("���� : "+tax);
	}
	
}
