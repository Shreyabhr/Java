package com.techlab.model;

import java.util.ArrayList;

public class Board {
	private ArrayList<Cell> board;
	private int size;
	
	public Board(int size) {
		this.size = size;
		this.board = new ArrayList<Cell>();
		for(int i = 0; i < size * size ; i++) {
			board.add(new Cell());
		}
	}
	
	public ArrayList<Cell> getBoard() {
		return this.board;
	}
	
	public int getSize() {
		return size;
	}
	
	public void markCell(int index, Mark mark) throws CellAlreadyMarkedException {
		board.get(index).setMark(mark);
	}
	
	
	public boolean check_if_board_is_full() {
		for(Cell cells : board) {
			if(cells.getMark().equals(Mark.EMPTY)) {
				return false;
			}
		}
		return true;
	}

}
