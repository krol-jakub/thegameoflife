package edu.thegameoflife;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Board {

	HashMap<Point,Integer> listOfLivingCells;
	HashMap<Point,Integer> listOfNeighbouringCells;
	
	public Board() {
		listOfLivingCells = new HashMap<Point,Integer>();
		listOfNeighbouringCells = new HashMap<Point,Integer>();
	}
	
	public HashMap<Point, Integer> getListOfNeighbouringCells() {
		return listOfNeighbouringCells;
	}

	public void setListOfNeighbouringCells(HashMap<Point, Integer> listOfNeighbouringCells) {
		this.listOfNeighbouringCells = listOfNeighbouringCells;
	}
	
	public void fillListOfNeigbouringCells() {
		int aliveNeighbours = 0;
		
	}
	
	public int countAliveNeighbours(Point point) {
		return 0;
	}

	public HashMap<Point, Integer> getListOfLivingCells() {
		return listOfLivingCells;
	}

	public void setListOfLivingCells(HashMap<Point, Integer> listOfLivingCells) {
		this.listOfLivingCells = listOfLivingCells;
	}

}
