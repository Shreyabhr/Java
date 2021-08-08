package com.techlab.presentation;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.techlab.model.Board;
import com.techlab.model.CellAlreadyMarkedException;
import com.techlab.model.Game;
import com.techlab.model.IBoard;
import com.techlab.model.Mark;
import com.techlab.model.Player;
import com.techlab.model.Result;
import com.techlab.model.ResultAnalyzer;

public class TicTacToeConsole {
	
	private Game game;
	
	public TicTacToeConsole(){
		
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter name of player 1: ");
		Player p1 = new Player(Mark.O,sc.nextLine());
		System.out.println("Enter name of player 2: ");
		Player p2 = new Player(Mark.X,sc.nextLine());

		System.out.println("Enter size of board: ");
		IBoard board = new Board(sc.nextInt());

		ArrayList<Player> players = new ArrayList<Player>();
		players.add(p1);
		players.add(p2);
		
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board);
		game = new Game(players,board,resultAnalyzer);
		printBoard(board);
		System.out.println("\n" +game.getCurrentPlayer().getName()+ " enter cell(0-8)");
		
		for(int i = 0; i < board.getSize() * board.getSize(); i++) {
			int index = sc.nextInt();
			try {
				game.play(index);
				printBoard(board);
			}catch(CellAlreadyMarkedException e) {
				game.changePlayer();
				System.out.println("Try again");
				i--;
				System.out.println(e.getMessage());
			}
			Result result = resultAnalyzer.getResult(board, game.getCurrentPlayer().getMark(), index);
			if(checkWin(result) || checkDraw(result)) {
				return;
			}
			System.out.println("\n" +game.getNextPlayerName()+ " enter cell(0-8)");
		}
	}

	private void printBoard(IBoard board) {
		for(int i = 0; i < board.getSize(); i++) {
			printBoardRows(board,i);
		}
	}
	
	public boolean checkWin(Result result) {
		if(result == Result.WIN) {
			System.out.println("\n" +game.getCurrentPlayer().getName()+ " is the winner");
			return true;
		}
		return false;
	}
	
	public boolean checkDraw(Result result) {
		if(result == Result.DRAW) {
			System.out.println("It is a draw");
			return true;
		}
		return false;
	}
	
	private void printBoardRows(IBoard board, int row) {
		for(int j = 0; j < board.getSize(); j++) {
			markBoard(board,row,j);
		}
		System.out.println("\n");
	}
	
	private void markBoard(IBoard board, int row, int column) {
		if(board.getBoard().get(row * board.getSize() + column).getMark() == Mark.EMPTY) System.out.print("_ ");
		else if(board.getBoard().get(row * board.getSize() + column).getMark() == Mark.O) System.out.print("O ");
		else if(board.getBoard().get(row * board.getSize() + column).getMark() == Mark.X) System.out.print("X ");
	}

}
