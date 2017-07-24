package com.souro.functionalinterface;

public class FunctionalInterfaceDemo implements Research1 {
	public void provideInfo(){
		System.out.println("Remember, deep down in Machine Learning, Math is hidden there !!");
	}
	public static void main(String args[]){
		FunctionalInterfaceDemo obj = new FunctionalInterfaceDemo();
		obj.provideInfo();
	}
}
