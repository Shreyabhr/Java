package com.techlab.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.techlab.model.Board;
import com.techlab.model.Cell;
import com.techlab.model.CellAlreadyMarkedException;
import com.techlab.model.Game;
import com.techlab.model.Mark;
import com.techlab.model.Player;
import com.techlab.model.Result;
import com.techlab.model.ResultAnalyzer;

public class TicTacToeTest {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter name of player 1: ");
		Player p1 = new Player(Mark.O,sc.nextLine());
		System.out.println("Enter name of player 2: ");
		Player p2 = new Player(Mark.X,sc.nextLine());

		System.out.println("Enter size of board: ");
		Board board = new Board(sc.nextInt());

		ArrayList<Player> players = new ArrayList<Player>();
		players.add(p1);
		players.add(p2);
		
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board);
		Game game = new Game(players,board,resultAnalyzer);
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
			Result result = resultAnalyzer.getresult(board, game.getCurrentPlayer().getMark(), index);
			if(result == Result.WIN) {
				System.out.println("\n" +game.getCurrentPlayer().getName()+ " is the winner");
				break;
			}
			else if(result == Result.DRAW) {
				System.out.println("It is a draw");
				break;
			}
			System.out.println("\n" +game.getNextPlayerName()+ " enter cell(0-8)");
		}
		

	}

	private static void printBoard(Board board) {
		for(int i = 0; i < board.getSize(); i++) {
			for(int j = 0; j < board.getSize(); j++) {
				if(board.getBoard().get(i * board.getSize() + j).getMark() == Mark.EMPTY) System.out.print("_ ");
				else if(board.getBoard().get(i * board.getSize() + j).getMark() == Mark.O) System.out.print("O ");
				else if(board.getBoard().get(i * board.getSize() + j).getMark() == Mark.X) System.out.print("X ");
			}
			System.out.println("\n");
		}

	}
}
