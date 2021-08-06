package com.techlab.test;

import com.techlab.model.Cricket;
import com.techlab.model.Football;
import com.techlab.model.Game;

public class TemplateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game1 = new Cricket();
		game1.play();
		Game game2 = new Football();
		game2.play();
		

	}

}
