package com.infy.oop.patterns.abstractfactory;

public class PCFactory implements ComputerAbstractFactory{

	private String ram;
	private String hdd;
	private String cpu;
	
	public PCFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	public Computer getComputer() {
		return new PC(ram, hdd, cpu);
	}

}
