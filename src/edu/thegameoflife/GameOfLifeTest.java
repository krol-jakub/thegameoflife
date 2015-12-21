package edu.thegameoflife;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameOfLifeTest {

	private GameOfLife game;
	
	@Before
	public void setUp() {
		game = new GameOfLife();	
	}
	
	@Test
	public void someTest() {
		// given
		HashMap<Point,Integer> input = new HashMap<Point,Integer>();
		input.put(new Point(1,1), new Integer(0));
		
		HashMap<Point,Integer> output = new HashMap<Point,Integer>();
		
		// when
		output = game.playNextRound(input);
		
		// then
		Assert.assertEquals(input, output);
	}
}
