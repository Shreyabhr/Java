package com.techlab.model;


import java.util.ArrayList;

public class Game{
	
	private ArrayList<Player> players;
	private IBoard board;
	private ResultAnalyzer resultAnalyzer;
	private Player currentPlayer;
	private int playCount = 0;
	
	public Game (ArrayList<Player> players, IBoard board, ResultAnalyzer resultAnalyzer) {
	
		this.players = players;
		this.board = board;
		this.resultAnalyzer = resultAnalyzer;
		this.currentPlayer = players.get(0);
	}

	public IBoard getBoard() {
		return board;
	}
	
	public ResultAnalyzer getResultAnalyzer() {
		return resultAnalyzer;
	}
	
	public String getNextPlayerName() {
		if(currentPlayer == players.get(0)) {
			return players.get(1).getName();
		}
		return players.get(0).getName();
		
	}
	
	public Result play(int index) throws CellAlreadyMarkedException {
		if(playCount>0) {
			changePlayer();
		}
		playCount++;
		Mark mark = currentPlayer.getMark();
		board.markCell(index, mark);
		if(playCount > 4) {
			Result result = resultAnalyzer.getResult(board,mark,index);
			return result;
		}
		return Result.PROCESS;
		
	}
	
	public  Player getCurrentPlayer() {
		return currentPlayer;
	}
	
	public void changePlayer() {
		if(getCurrentPlayer() == players.get(0)) {
			currentPlayer = players.get(1);
		}
		else if(getCurrentPlayer() == players.get(1)){
			currentPlayer = players.get(0);
		}
	}
	
	
	
}
