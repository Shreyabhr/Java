package com.techlab.test;

import com.techlab.model.AutoType;
import com.techlab.model.AutomobileFactory;
import com.techlab.model.IAuto;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutomobileFactory factory = AutomobileFactory.getInstance();
		IAuto auto = factory.make(AutoType.BMW);
		auto.start();
		auto.stop();
		auto.getName();
	}

}
