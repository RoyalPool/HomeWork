package com.javalec.children;

public class MainClass {
 
	public static void main(String args[]){
	
	LanuchMenu child1=new Child1(PriceTable.RICE, PriceTable.BULGOGI,PriceTable.DOOBU,PriceTable.MI,PriceTable.YOGURT,PriceTable.MILK,PriceTable.BANANA,PriceTable.ALMIND);
	LanuchMenu child2=new Child2(PriceTable.RICE,PriceTable.BULGOGI,PriceTable.DOOBU,PriceTable.MI,PriceTable.YOGURT,PriceTable.MILK,PriceTable.BANANA,PriceTable.ALMIND);
	
	System.out.println("child1 �� �޽ıݾ���"+child1.calculation());
	System.out.println("child2�� �޽ıݾ���"+child2.calculation());
 }
}
