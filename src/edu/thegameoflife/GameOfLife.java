package edu.thegameoflife;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class GameOfLife {

	private Board gameBoard;
	
	public GameOfLife() {
		gameBoard = new Board();
	}
	
	public HashMap<Point,Integer> playNextRound(HashMap<Point,Integer> inputList) {
		gameBoard.getListOfLivingCells().clear();
		gameBoard.getListOfNeighbouringCells().clear();
		gameBoard.setListOfLivingCells(inputList);
		gameBoard.fillListOfNeigbouringCells();
		
		HashMap<Point,Integer> outputList = new HashMap<Point,Integer>();
		outputList.clear();
		
		for(final Iterator<Entry<Point, Integer>> it = gameBoard.getListOfLivingCells().entrySet().iterator() ; it.hasNext() ; ) {
			Entry<Point, Integer> tmp = it.next();
			if(tmp.getValue() == 2 || tmp.getValue() == 3) {
				outputList.put(tmp.getKey(), tmp.getValue());
			}
		}
		
		for(final Iterator<Entry<Point, Integer>> it = gameBoard.getListOfNeighbouringCells().entrySet().iterator() ; it.hasNext() ; ) {
			Entry<Point, Integer> tmp = it.next();
			if(tmp.getValue() == 3) {
				outputList.put(tmp.getKey(), tmp.getValue());
			}
		}
		
		outputList = gameBoard.recountAliveNeighbours(outputList);
				
		return outputList;
	}

	public Board getGameBoard() {
		return gameBoard;
	}

	public void setGameBoard(Board gameBoard) {
		this.gameBoard = gameBoard;
	}

}
