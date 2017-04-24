package com.javalec.car;

public class MainClass {
	public static void main(String args[]){
	StartCar starCarLowGrade=new StarCarLowGrade(Table.Tire_NORMAL, Table.Color_BLUE, Table.HANDLE_NORMAL, Table.DISPLACEMENT_NORMAL);
	StartCar starCarHighGrade=new StarCarHighGrade(Table.Tire_WILD, Table.Color_RED, Table.HANDLE_POWER, Table.DISPLACEMENT_HIGH);
	
	starCarLowGrade.CarSpec();
	starCarHighGrade.CarSpec();
//testtest
	}
}
