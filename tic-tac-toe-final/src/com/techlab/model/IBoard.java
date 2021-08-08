package com.techlab.model;

import java.util.ArrayList;

public interface IBoard {

	ArrayList<Cell> getBoard();

	int getSize();

	void markCell(int index, Mark mark) throws CellAlreadyMarkedException;

	boolean check_if_board_is_full();

}