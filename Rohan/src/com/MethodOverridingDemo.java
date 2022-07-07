package com;
class Bank{
	float getRateofInterest() {
	return 6.7f;
}
}
class SBI extends Bank
{

	@Override
	float getRateofInterest() {
		// TODO Auto-generated method stub
		return 6.8f;
	}
}
class HDFC extends Bank{

	@Override
	float getRateofInterest() {
		// TODO Auto-generated method stub
		return 6.5f;
	}
	
	
}
class ICICI extends Bank{

	@Override
	float getRateofInterest() {
		// TODO Auto-generated method stub
		return 6.9f;
	}
	
}
public class MethodOverridingDemo{
	public static void main(String[] args) {
		SBI obj=new SBI();
		System.out.println(obj.getRateOfInterest());
		System.out.println(obj 1. getRateOfInterest());
	}
}




