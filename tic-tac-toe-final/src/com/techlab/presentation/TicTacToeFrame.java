package com.techlab.presentation;


import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.techlab.model.Board;
import com.techlab.model.CellAlreadyMarkedException;
import com.techlab.model.Game;
import com.techlab.model.IBoard;
import com.techlab.model.Mark;
import com.techlab.model.Player;
import com.techlab.model.Result;
import com.techlab.model.ResultAnalyzer;

public class TicTacToeFrame extends JFrame implements ActionListener{
	
	private ArrayList<JButton> buttons = new ArrayList<JButton>();
	private Game game;
	private IBoard board;
	private ResultAnalyzer resultAnalyzer;

	public TicTacToeFrame(String name1, String name2, String boardSize){

		Player p1 = new Player(Mark.O,name1);
		Player p2 = new Player(Mark.X,name2);
		
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(p1);
		players.add(p2);
		System.out.println(Integer.parseInt(boardSize));
		board = new Board(Integer.parseInt(boardSize));
		resultAnalyzer = new ResultAnalyzer(board);
		game = new Game(players,board,resultAnalyzer);
	
		
		setLayout(new GridLayout(board.getSize(), board.getSize()));
		for(int i = 0; i < board.getSize() * board.getSize() ; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setActionCommand(""+i);
			b.setName(Integer.toString(i));
			b.setFont(new Font("Ariel", Font.PLAIN, 40));
			add(b);
			b.addActionListener(this);
			buttons.add(b);
		}
		setBounds(450, 190, 1014, 597);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int index = Integer.parseInt(e.getActionCommand());
		perform(index);
		
	}
	
	public void perform(int btnIndex) {
		
			int index = btnIndex;
			try {
				game.play(index);
				markTheButton(index);
				this.setTitle(game.getCurrentPlayer().getName()+" is playing");
			} catch (CellAlreadyMarkedException e) {
				game.changePlayer();
				JOptionPane.showMessageDialog(this, "Already marked cell", "Warning", JOptionPane.WARNING_MESSAGE); 
			}
			Result result = resultAnalyzer.getResult(board, game.getCurrentPlayer().getMark(), btnIndex);
			if(checkWin(result) || checkDraw(result)) {
				return;
			}
		
	}
	
	private void markTheButton(int index) {
		if(game.getCurrentPlayer().getMark() == Mark.X) {
			buttons.get(index).setText("X");
		}else if(game.getCurrentPlayer().getMark() == Mark.O){
			buttons.get(index).setText("O");
		}
	}
	
	public void disableButtons() {
		for(JButton button : buttons) {
			button.setEnabled(false);
		}
	}
	
	public boolean checkWin(Result result) {
		if(result == Result.WIN) {
			disableButtons();
			JOptionPane.showMessageDialog(this, "Congratulations ," +game.getCurrentPlayer().getName()+ " Won");  
			return true;
		}
		return false;
	}
	
	public boolean checkDraw(Result result) {
		if(result == Result.DRAW) {
			JOptionPane.showMessageDialog(this, "It is a draw"); 
			disableButtons();
			return true;
		}
		return false;
	}

	

}
