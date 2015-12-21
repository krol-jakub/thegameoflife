package edu.thegameoflife;

public class Point {
	
	private int x;
	private int y;

	public Point() {
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(Point key) {
		this.x = key.getX();
		this.y = key.getY();
	}
	
	public Point(Point key, int x_offset, int y_offset) {
		this.x = key.getX() + x_offset;
		this.y = key.getY() + y_offset;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public boolean equals(Object o) {
		return false;
	}

}
