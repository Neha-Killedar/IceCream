package com.csi.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

enum IceCream{
	
	VANILLA(20.00), CHOCOLATE(25.00), STRAWBERRY(30.00), BUTTERSCOTCH(35.00), RASBERRY(50.00);
	
	private double price;
	IceCream(double p) {
		// TODO Auto-generated constructor stub
		price=p;
	}
	static void getPrice(int i){
		IceCream allIceCream[]= IceCream.values();
		System.out.println("\n Pay Rs.:  "+allIceCream[i].price);
	}
}
public class IceCreamProject {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("\n AVAILABLE ICECREAMS: ");
		for(IceCream ice: IceCream.values()){
			int no=ice.ordinal();
			System.out.println(no+" "+ice);
		}
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n\n Your Choice: ");
		int cho= Integer.parseInt(br.readLine());
		IceCream.getPrice(cho);
	}
}
