package com.techlab.model;

import java.util.ArrayList;

public class ResultAnalyzer {
	
	private int count;
	private IBoard board;
	
	public ResultAnalyzer(IBoard board) {
		this.board = board;
	}
	
	public int getCount() {
		return count;
	}
	
	private boolean checkRow() {
		ArrayList<Mark> list = new ArrayList<Mark>();
		for(int i = 0; i < board.getSize(); i++) {
			checkRowElements(i,list);
			if(checkList(list)) 
				return true;
			list.clear();
		}
		return false;
	}
	
	private void checkRowElements(int i, ArrayList<Mark> list) {
		for(int j = 0; j < board.getSize(); j++)
			list.add(board.getBoard().get((board.getSize() * i) + j).getMark());
	}
	
	
	private boolean checkColumn() {
		ArrayList<Mark> list = new ArrayList<Mark>();		
		for(int i = 0; i < board.getSize(); i++) {
			checkColumnElements(i,list);
			if(checkList(list)) 
				return true;
			list.clear();
		}
		return false;
	}
	
	private void checkColumnElements(int i, ArrayList<Mark> list) {
		for(int j = i; j < board.getSize() * board.getSize(); j=j+board.getSize()) {
			list.add(board.getBoard().get(j).getMark());
		}
	}
	
	private boolean checkUpperDiagonal() {
		ArrayList<Mark> list = new ArrayList<Mark>();
		for(int i = 0; i < board.getSize(); i++) {
			list.add(board.getBoard().get(i * board.getSize() + i).getMark());
		}
		return checkList(list);
		
	}
	
	private boolean checkLowerDiagonal() {
		ArrayList<Mark> list = new ArrayList<Mark>();
		for(int i = 1; i < board.getSize(); i++) {
			list.add(board.getBoard().get(i * board.getSize() - i).getMark());
		}
		return checkList(list);
	}
	
	
	private boolean draw() {
		if(board.check_if_board_is_full()) {
			return true;
		}
		return false;
	}
	
	public Result getResult(IBoard board, Mark mark, int index) {
		if(checkRow() || checkColumn() || checkUpperDiagonal() || checkLowerDiagonal()) {
			return Result.WIN;
		}
		else if(draw()) {
			return Result.DRAW;
		}
		return Result.PROCESS;
	}
	
	public boolean equal(ArrayList<Mark> list) {
		for(Mark cell : list) {
			if(!cell.equals(list.get(0))) return false;
		}
		return true;
	}
	
	public boolean checkList(ArrayList<Mark> list) {
		if(equal(list) && list.get(0) != Mark.EMPTY) {
			return true;
		}
		return false;
	}


}
