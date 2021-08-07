package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CellTest {
	
	Cell c = new Cell();

	@Test
	void test_if_cell_is_empty() {
		Mark expectedMark = Mark.EMPTY;
		assertEquals(expectedMark,c.getMark());
	}
	
	@Test
	void test_if_cell_is_o() throws CellAlreadyMarkedException {
		c.setMark(Mark.O);
		Mark expectedMark = Mark.O;
		assertEquals(expectedMark,c.getMark());
	}
	
	@Test
	void test_if_cell_is_x() throws CellAlreadyMarkedException {
		Mark expectedMark = Mark.X;
		c.setMark(Mark.X);
		assertEquals(expectedMark,c.getMark());
	}
	
	@Test
	void check_if_cell_is_already_marked_throws_exception() throws CellAlreadyMarkedException {
		String msg = null;
		c.setMark(Mark.O);
		try {
			c.setMark(Mark.X);
		}catch(Exception e){
			msg = e.getMessage();
		}
		
		assertEquals(msg,"This cell is already marked");
		
		
	}
	
	

}
