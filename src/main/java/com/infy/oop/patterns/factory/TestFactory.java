package com.infy.oop.patterns.factory;

public class TestFactory {
	
	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer("pc", "4 GB", "500 GB", "Dual Core");
		
		System.out.println(pc);
		
		Computer server = ComputerFactory.getComputer("server", "100 GB", "500 TB", "i7 12th Gen");
		
		System.out.println(server);
	}

}
