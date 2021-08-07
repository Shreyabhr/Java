package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoardTest {

	@Test
	void Check_if_board_is_full() throws CellAlreadyMarkedException {
		boolean expectedresult = true;
		Board b = new Board(3);
		b.markCell(0, Mark.O);
		b.markCell(1, Mark.X);
		b.markCell(2, Mark.O);
		b.markCell(3, Mark.X);
		b.markCell(4, Mark.O);
		b.markCell(5, Mark.X);
		b.markCell(6, Mark.O);
		b.markCell(7, Mark.X);
		b.markCell(8, Mark.O);
		assertEquals(expectedresult,b.check_if_board_is_full());
	}
	
	@Test
	void check_size() {
		int expectedsize = 9;
		Board b = new Board(3);
		assertEquals(expectedsize,b.getBoard().size());
	}
	
	@Test
	void check_if_board_is_empty() throws CellAlreadyMarkedException {
		boolean isboardempty = false;
		Board b = new Board(3);
		b.markCell(0, Mark.O);
		assertEquals(isboardempty,b.check_if_board_is_full());
	}
	
	@Test
	void check_if_cell_is_already_marked_throws_exception() throws CellAlreadyMarkedException {
		String msg = null;
		String expectedmsg = "This cell is already marked";
		Board b = new Board(3);
		b.markCell(0, Mark.X);
		try {
			b.markCell(0, Mark.O);
		}catch(Exception e) {
			msg = e.getMessage();
		}
		assertEquals(expectedmsg,msg);
	}
	
	@Test
	void check_if_cell_of_board_marked_on_given_position() throws CellAlreadyMarkedException {
		Board b = new Board(3);
		Mark expectedMark = Mark.O;
		b.markCell(5, Mark.O);
		Mark actualMark = b.getBoard().get(5).getMark();
		assertEquals(expectedMark,actualMark);
		
	}
	
	
	
	
	
	
	

}
