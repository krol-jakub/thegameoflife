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
		gameBoard.setListOfLivingCells(inputList);
		gameBoard.fillListOfNeigbouringCellsToBeAlive();
		
		//System.out.println(gameBoard.getListOfNeighbouringCells());
		System.out.println(gameBoard.getListOfLivingCells());
		System.out.println(new Point(1,1));
		//System.out.println(gameBoard.getListOfNeighbouringCells().size());
		
		/*for(final Iterator<Entry<Point, Integer>> it = gameBoard.getListOfLivingCells().entrySet().iterator() ; it.hasNext() ; ) {
			Entry<Point, Integer> tmp = it.next();
			System.out.println(String.format("(%1$d,%2$d), neighbours: %3$d", tmp.getKey().getX(), tmp.getKey().getY(), tmp.getValue()));
		}
		System.out.println("--------------------------------------------------------");
		for(final Iterator<Entry<Point, Integer>> it = gameBoard.getListOfNeighbouringCells().entrySet().iterator() ; it.hasNext() ; ) {
			Entry<Point, Integer> tmp = it.next();
			System.out.println(String.format("(%1$d,%2$d), neighbours: %3$d", tmp.getKey().getX(), tmp.getKey().getY(), tmp.getValue()));
		}*/
		
		return inputList;
	}

	public Board getGameBoard() {
		return gameBoard;
	}

	public void setGameBoard(Board gameBoard) {
		this.gameBoard = gameBoard;
	}

}
