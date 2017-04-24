package com.javalec.children;

public class Child1 extends LanuchMenu{

	public Child1(int rice, int bulgogi, int doobu, int mi, int yogurt, int banana, int milk, int almond){
		super(rice,bulgogi,doobu,mi, yogurt, banana,milk, almond);
	}

	@Override
	public int calculation() {
		return rice+bulgogi+doobu+mi+milk+yogurt;
	}
}
