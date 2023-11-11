package com.infy.oop.patterns.abstractfactory;

public class LaptopFactory implements ComputerAbstractFactory{

	private String ram;
	private String hdd;
	private String cpu;
	
	public LaptopFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	public Computer getComputer() {
		return new Laptop(ram, hdd, cpu);
	}

}
