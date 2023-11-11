package com.infy.oop.patterns.abstractfactory;

public class TestAbstractFactory {
	
	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer(new PCFactory("4 GB", "500 GB", "Dual Core"));
		
		System.out.println(pc);
		
		Computer server = ComputerFactory.getComputer(new ServerFactory("100 GB", "500 TB", "i7 12th Gen"));
		
		System.out.println(server);
		
		Computer laptop = ComputerFactory.getComputer(new LaptopFactory("16 GB", "1 TB", "i5 10th Gen"));
		
		System.out.println(laptop);
	}

}
