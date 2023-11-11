package com.infy.oop.patterns.singleton;

public class DoubleCheckingLockThreadSafeSingleton {

	public static DoubleCheckingLockThreadSafeSingleton instance = null;

	public DoubleCheckingLockThreadSafeSingleton() {
		// since this is a private constructor.. only accessible in this class
	}

	public static DoubleCheckingLockThreadSafeSingleton getInstance() {
		if (instance == null) {
			
			synchronized (DoubleCheckingLockThreadSafeSingleton.class) {
				if (instance == null)
				instance = new DoubleCheckingLockThreadSafeSingleton();
			}
		}
		return instance;
	}

}
