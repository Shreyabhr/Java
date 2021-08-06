package com.techlab.test;

import com.techlab.model.DataService;

public class DataServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				DataService ds1 = DataService.getInstance();
				ds1.doSomething();
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				DataService ds2 = DataService.getInstance();
				ds2.doSomething();
				
			}
		});
		
		t1.start();
		t2.start();

	}

}
