package edu.thegameoflife;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Board {

	HashMap<Point,Integer> listOfLivingCells;
	HashMap<Point,Integer> listOfNeighbouringCells;
	HashMap<Point,Integer> listOfNeighbouringCellsToBeAlive;
	
	public Board() {
		listOfLivingCells = new HashMap<Point,Integer>();
		listOfNeighbouringCells = new HashMap<Point,Integer>();
		listOfNeighbouringCellsToBeAlive = new HashMap<Point,Integer>();
	}
	
	public void fillListOfNeigbouringCellsToBeAlive() {
		for(final Iterator<Entry<Point, Integer>> it = listOfLivingCells.entrySet().iterator() ; it.hasNext() ; ) {
			Entry<Point, Integer> tmp = it.next();
			for(int i = -1 ; i <= 1 ; ++i) {
				for(int j = -1 ; j <= 1 ; ++j) {
					if(i == 0 && j == 0) {
						continue;
					}
					listOfNeighbouringCells.put(new Point(tmp.getKey().getX()+j, tmp.getKey().getY()+i), 
							new Integer(countAliveNeighbours(new Point(tmp.getKey().getX()+j, tmp.getKey().getY()+i))));
				}	
			}
		}
	}
	
	public int countAliveNeighbours(Point point) {
		int aliveNeighbours = 0;
		for(int i = -1 ; i <= 1 ; ++i) {
			for(int j = -1 ; j <= 1 ; ++j) {
				if(i == 0 && j == 0) {
					continue;
				}
				if(listOfLivingCells.containsKey(new Point(point.getX()+j, point.getY()+i))) {
					++aliveNeighbours;
				}
			}	
		}
		return aliveNeighbours;
	}
	
	public HashMap<Point, Integer> getListOfLivingCells() {
		return listOfLivingCells;
	}

	public void setListOfLivingCells(HashMap<Point, Integer> listOfLivingCells) {
		this.listOfLivingCells = listOfLivingCells;
	}
	
	public HashMap<Point, Integer> getListOfNeighbouringCells() {
		return listOfNeighbouringCells;
	}

	public void setListOfNeighbouringCells(HashMap<Point, Integer> listOfNeighbouringCells) {
		this.listOfNeighbouringCells = listOfNeighbouringCells;
	}

	public HashMap<Point, Integer> getListOfNeighbouringCellsToBeAlive() {
		return listOfNeighbouringCellsToBeAlive;
	}

	public void setListOfNeighbouringCellsToBeAlive(HashMap<Point, Integer> listOfNeighbouringCellsToBeAlive) {
		this.listOfNeighbouringCellsToBeAlive = listOfNeighbouringCellsToBeAlive;
	}

}
