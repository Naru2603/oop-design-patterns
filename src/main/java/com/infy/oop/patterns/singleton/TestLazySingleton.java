package com.infy.oop.patterns.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TestLazySingleton {
	
	public static void main(String[] args) {
		
//		LazySingleton obj1 = LazySingleton.getInstance();
//		LazySingleton obj2 = LazySingleton.getInstance();
//		
//		System.out.println(obj1 == obj2);
		
		
		BillPughSingleton obj1 = BillPughSingleton.getInstance();

		
		//Breaking LazySinglton using deserialization
		
		//step 1 - write obj1 into a file (serialize)
		ObjectOutput out;
		try {
			out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
			out.writeObject(obj1);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//step 2 - read obj1 from file (deserialize) NOTE: Deserialzation always creates new instance
		
		ObjectInput in;
		BillPughSingleton obj3 = null;
		try {
			in = new ObjectInputStream(new FileInputStream("filename.ser"));
			obj3 = (BillPughSingleton) in.readObject();
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(obj1 == obj3);

		
	}

}
