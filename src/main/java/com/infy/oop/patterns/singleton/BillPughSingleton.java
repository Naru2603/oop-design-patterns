package com.infy.oop.patterns.singleton;

public class BillPughSingleton {
	
	private BillPughSingleton()
	{
		
	}
	
	private static class LazyHolder{
		private static BillPughSingleton instance = null;
		
	}
	
	public static BillPughSingleton getInstance()
	{
		return LazyHolder.instance;
	}
	
	
	/*
	 * As you can see, until we need an instance, the LazyHolder class will not be
	 * initialized until required and you can still use other static members of
	 * BillPughSingleton class. This is the solution, i will recommend to use.
	 */

}
