package com.javalec.children;

public abstract class LanuchMenu {
	public int rice;
	public int bulgogi;
	public int doobu;
	public int mi;
	
	public int yogurt;
	public int banana;
	public int milk;
	public int almond;
	
	public LanuchMenu(int rice, int bulgogi, int doobu, int mi, int yogurt, int banana, int milk, int almond) {
	
	this.rice=rice;
	this.bulgogi=bulgogi;
	this.almond=almond;
	this.banana=banana;
	this.doobu=doobu;
	this.mi=mi;
	this.milk=milk;
	this.yogurt=yogurt;
	

	}
	
	public abstract int calculation();
}
