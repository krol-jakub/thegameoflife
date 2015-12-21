package edu.thegameoflife;

import java.util.HashMap;

public class GameOfLife {

	private Board gameBoard;
	
	public GameOfLife() {
		setGameBoard(new Board());
	}
	
	public HashMap<Point,Integer> playNextRound(HashMap<Point,Integer> inputList) {
		return inputList;
	}

	public Board getGameBoard() {
		return gameBoard;
	}

	public void setGameBoard(Board gameBoard) {
		this.gameBoard = gameBoard;
	}

}
