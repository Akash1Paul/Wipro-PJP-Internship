package com.automobile.twowheeler;
import com.automobile.Vehicle;
public class Hero extends Vehicle {
	public  String modelName;
	public  String registrationNumber;
	public  String  ownerName;
	public int speed;
	
	public Hero(String modelName, String registrationNumber, String ownerName, int speed) {
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
	}
		public String getModelName() {
			// TODO Auto-generated method stub
			return modelName;
		}

		@Override
		public String getRegistrationNumber() {
			// TODO Auto-generated method stub
			return registrationNumber;
		}

		@Override
		public String getOwnerName() {
			// TODO Auto-generated method stub
			return ownerName;
		}
		
		public int getSpeed() {
			return speed;
		}
		
		public void radio() {
			System.out.println("Accessing the radio");
	}
}
