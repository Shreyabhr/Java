package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class GameTest {


	@Test
	void testGetNextPlayerName() {
		String expectedname = "bcd";
		Player p1 = new Player(Mark.O,"abc");
		Player p2 = new Player(Mark.X,"bcd");
		Board board = new Board(3);
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(p1);
		players.add(p2);
		ResultAnalyzer result = new ResultAnalyzer(board);
		Game game = new Game(players,board,result);
		String actucalname = game.getNextPlayerName();
		assertEquals(expectedname, actucalname);
	}

	@Test
	void testPlay() throws CellAlreadyMarkedException {
		Result expectedresult = Result.PROCESS;
		Player p1 = new Player(Mark.O,"abc");
		Player p2 = new Player(Mark.X,"bcd");
		Board board = new Board(3);
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(p1);
		players.add(p2);
		ResultAnalyzer result = new ResultAnalyzer(board);
		Game game = new Game(players,board,result);
		Result actualresult = game.play(0);
		assertEquals(expectedresult, actualresult);
		
	}

	@Test
	void testChangePlayer() {
		Player p1 = new Player(Mark.O,"abc");
		Player p2 = new Player(Mark.X,"bcd");
		Player expectedplayer = p2;
		Board board = new Board(3);
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(p1);
		players.add(p2);
		ResultAnalyzer result = new ResultAnalyzer(board);
		Game game = new Game(players,board,result);
		game.changePlayer();
		assertEquals(expectedplayer,game.getCurrentPlayer());
	}

}
