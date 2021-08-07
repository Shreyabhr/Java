package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ResultAnalyzerTest {

	@Test
	void check_if_row_win() throws CellAlreadyMarkedException {
		boolean expectedresult = true;
		Board b = new Board(3);
		b.markCell(0, Mark.X);
		b.markCell(1, Mark.X);
		b.markCell(2, Mark.X);
		ResultAnalyzer result = new ResultAnalyzer(b);
		boolean actualresult = result.checkRow(Mark.X);
		assertEquals(expectedresult,actualresult);
	
	}
	
	@Test
	void check_if_col_win() throws CellAlreadyMarkedException {
		boolean expectedresult = true;
		Board b = new Board(3);
		b.markCell(0, Mark.X);
		b.markCell(3, Mark.X);
		b.markCell(6, Mark.X);
		ResultAnalyzer result = new ResultAnalyzer(b);
		boolean actualresult = result.checkColumn(Mark.X);
		assertEquals(expectedresult,actualresult);
	}
	
	@Test
	void check_if_upperdiagonal_win() throws CellAlreadyMarkedException {
		boolean expectedresult = true;
		Board b = new Board(3);
		b.markCell(0, Mark.X);
		b.markCell(4, Mark.X);
		b.markCell(8, Mark.X);
		ResultAnalyzer result = new ResultAnalyzer(b);
		boolean actualresult = result.checkUpperDiagonal(Mark.X);
		assertEquals(expectedresult,actualresult);
	}
	
	@Test
	void check_if_lowerdiagonal_win() throws CellAlreadyMarkedException {
		boolean expectedresult = true;
		Board b = new Board(3);
		b.markCell(2, Mark.X);
		b.markCell(4, Mark.X);
		b.markCell(6, Mark.X);
		ResultAnalyzer result = new ResultAnalyzer(b);
		boolean actualresult = result.checkLowerDiagonal(Mark.X);
		assertEquals(expectedresult,actualresult);
	}
	
	@Test
	void check_if_draw() throws CellAlreadyMarkedException {
		boolean expectedresult = true;
		Board b = new Board(3);
		b.markCell(0, Mark.O);
		b.markCell(1, Mark.X);
		b.markCell(2, Mark.O);
		b.markCell(3, Mark.O);
		b.markCell(4, Mark.X);
		b.markCell(5, Mark.X);
		b.markCell(6, Mark.X);
		b.markCell(7, Mark.O);
		b.markCell(8, Mark.X);
		ResultAnalyzer result = new ResultAnalyzer(b);
		boolean actualresult = result.draw();
		assertEquals(expectedresult,actualresult);
		
	}
	
		

}
