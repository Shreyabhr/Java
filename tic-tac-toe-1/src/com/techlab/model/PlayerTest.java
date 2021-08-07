package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerTest {

	@Test
	void testPlayer() {
		Mark expectedmark = Mark.X;
		String expectedname = "abc";
		Player p1 = new Player(Mark.X,"abc");
		assertEquals(expectedmark,p1.getMark());
		assertEquals(expectedname,p1.getName());
	}

}
