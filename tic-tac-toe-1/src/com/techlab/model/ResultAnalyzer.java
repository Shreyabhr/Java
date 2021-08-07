package com.techlab.model;

import java.util.ArrayList;

public class ResultAnalyzer {
	
	private int count;
	private Board board;
	
	public ResultAnalyzer(Board board) {
		this.board = board;
	}
	
	public int getCount() {
		return count;
	}
	
	public boolean checkRow(Mark mark) {
		ArrayList<Mark> list = new ArrayList<Mark>();
		for(int i = 0; i < board.getSize(); i++) {
			for(int j = 0; j < board.getSize(); j++)
				list.add(board.getBoard().get((board.getSize() * i) + j).getMark());
			
			if(equal(list) && list.get(0) != Mark.EMPTY) {
			    return true;
		    }
			list.clear();
		}
		return false;
	}
	
	public boolean checkColumn(Mark mark) {
		ArrayList<Mark> list = new ArrayList<Mark>();
		
		for(int i = 0; i < board.getSize(); i++) {
			for(int j = i; j < board.getSize() * board.getSize(); j=j+board.getSize()) {
				list.add(board.getBoard().get(j).getMark());
			}
			if(equal(list) && list.get(0) != Mark.EMPTY) {
				return true;
			}
			list.clear();
		}
		return false;
	}
	
	public boolean checkUpperDiagonal(Mark mark) {
		ArrayList<Mark> list = new ArrayList<Mark>();
		for(int i = 0; i < board.getSize(); i++) {
			list.add(board.getBoard().get(i * board.getSize() + i).getMark());
		}
		if(equal(list) && list.get(0) != Mark.EMPTY) {
			return true;
		}
		return false;
		
	}
	
	public boolean checkLowerDiagonal(Mark mark) {
		ArrayList<Mark> list = new ArrayList<Mark>();
		for(int i = 1; i < board.getSize(); i++) {
			list.add(board.getBoard().get(i * board.getSize() - i).getMark());
		}
		if(equal(list) && list.get(0) != Mark.EMPTY) {
			return true;
		}
		return false;
	}
	
	
	public boolean draw() {
		for(Cell b : board.getBoard()) {
			if(b.getMark() == Mark.EMPTY) return false;
		}
		return true;
	}
	
	public Result getresult(Board board, Mark mark, int index) {
		if(checkRow(mark) || checkColumn(mark) || checkUpperDiagonal(mark) || checkLowerDiagonal(mark)) {
			return Result.WIN;
		}
		else if(draw()) {
			return Result.DRAW;
		}
		else return Result.PROCESS;
	}
	
	public boolean equal(ArrayList<Mark> list) {
		for(Mark cell : list) {
			if(!cell.equals(list.get(0))) return false;
		}
		return true;
	}
	

}
