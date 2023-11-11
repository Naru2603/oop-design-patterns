package com.infy.oop.patterns.singleton;

public class ThreadSafeSingleton {

	public static ThreadSafeSingleton instance = null;

	public ThreadSafeSingleton() {
		// since this is a private constructor.. only accessible in this class
	}

	public synchronized static ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}

}
