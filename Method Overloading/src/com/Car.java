package com;

public class Car  extends Vehicle{
	
	@Override
	void Start() {
		super.Start();
		System.out.println("Car Started");
	}
//	@Override --we can not use this 'over ride here ' bcz it is not inherited
	void end() {
	
		System.out.println("Car Stop");
	}

}
