package com.infy.oop.patterns.singleton;

public enum EnumSingleton {

	INSTANCE;
	
	 // Add any methods or fields you need for the Singleton
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // You can add more methods here if necessary
	
}
