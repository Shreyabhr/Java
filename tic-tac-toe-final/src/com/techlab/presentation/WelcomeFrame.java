package com.techlab.presentation;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class WelcomeFrame extends JFrame implements ActionListener{
	
	private JPanel contentPane;
    private JTextField player1Name;
    private JTextField player2Name;
    private JTextField board;
    private JButton playBtn;
	
	
	public WelcomeFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel title = new JLabel("Tic Tac Toe");
        title.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        title.setBounds(362, 52, 325, 50);
        contentPane.add(title);

        JLabel player1 = new JLabel("player1");
        player1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        player1.setBounds(58, 152, 99, 43);
        contentPane.add(player1);

        JLabel player2 = new JLabel("player2");
        player2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        player2.setBounds(58, 243, 110, 29);
        contentPane.add(player2);

        JLabel boardSize = new JLabel("Board Size");
        boardSize.setFont(new Font("Tahoma", Font.PLAIN, 20));
        boardSize.setBounds(58, 324, 124, 36);
        contentPane.add(boardSize);

        player1Name = new JTextField();
        player1Name.setFont(new Font("Tahoma", Font.PLAIN, 32));
        player1Name.setBounds(200, 151, 228, 50);
        contentPane.add(player1Name);
        player1Name.setColumns(10);

        player2Name = new JTextField();
        player2Name.setFont(new Font("Tahoma", Font.PLAIN, 32));
        player2Name.setBounds(200, 235, 228, 50);
        contentPane.add(player2Name);
        player2Name.setColumns(10);

        board = new JTextField();
        board.setFont(new Font("Tahoma", Font.PLAIN, 32));
        board.setBounds(200, 320, 228, 50);
        contentPane.add(board);
        board.setColumns(10);

        playBtn = new JButton("Play");
        
        playBtn.setFont(new Font("Tahoma", Font.PLAIN, 22));
        playBtn.setBounds(399, 447, 259, 74);
        contentPane.add(playBtn);
        playBtn.addActionListener(this);
        setVisible( true );
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String name1 = player1Name.getText();
		String name2 = player2Name.getText();
		String boardSize = board.getText();
		setVisible(false);
		TicTacToeFrame frame = new TicTacToeFrame(name1,name2,boardSize);
		frame.setVisible(true);
		
	}

}
