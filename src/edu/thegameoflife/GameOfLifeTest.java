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
	public void shouldHandleOneCellSpoilerItDies() {
		// given
		HashMap<Point,Integer> input = new HashMap<Point,Integer>();
		input.put(new Point(1,1), new Integer(1));
		
		HashMap<Point,Integer> output = new HashMap<Point,Integer>();
		output.clear();
		
		HashMap<Point,Integer> expectedOutput = new HashMap<Point,Integer>();
		expectedOutput.clear();
		
		// when
		output = game.playNextRound(input);
		
		// then
		Assert.assertEquals(output,expectedOutput);
	}
	
	@Test
	public void shouldHandleStreetlight() {
		// given
		HashMap<Point,Integer> input = new HashMap<Point,Integer>();
		input.put(new Point(1,1), new Integer(1));
		input.put(new Point(2,1), new Integer(2));
		input.put(new Point(3,1), new Integer(1));
		
		HashMap<Point,Integer> output = new HashMap<Point,Integer>();
		HashMap<Point,Integer> expectedOutput = new HashMap<Point,Integer>();
		expectedOutput.put(new Point(2,0), new Integer(1));
		expectedOutput.put(new Point(2,1), new Integer(2));
		expectedOutput.put(new Point(2,2), new Integer(1));
		
		// when
		output = game.playNextRound(input);
		
		// then
		Assert.assertEquals(output, expectedOutput);
	}
	
	@Test
	public void shouldHandleGlider() {
		// given
		HashMap<Point,Integer> input = new HashMap<Point,Integer>();
		input.put(new Point(0,1), new Integer(2));
		input.put(new Point(0,2), new Integer(3));
		input.put(new Point(1,1), new Integer(3));
		input.put(new Point(1,3), new Integer(1));
		input.put(new Point(2,1), new Integer(1));
		
		HashMap<Point,Integer> output = new HashMap<Point,Integer>();
		HashMap<Point,Integer> expectedOutput = new HashMap<Point,Integer>();
		expectedOutput.put(new Point(0,1), new Integer(3));
		expectedOutput.put(new Point(0,2), new Integer(2));
		expectedOutput.put(new Point(1,0), new Integer(2));
		expectedOutput.put(new Point(1,1), new Integer(4));
		expectedOutput.put(new Point(2,2), new Integer(1));
		
		// when
		output = game.playNextRound(input);
		
		// then
		Assert.assertEquals(output, expectedOutput);
	}
	
	@Test
	public void shouldHandleBox() {
		// given
		HashMap<Point,Integer> input = new HashMap<Point,Integer>();
		input.put(new Point(1,1), new Integer(3));
		input.put(new Point(2,1), new Integer(3));
		input.put(new Point(1,2), new Integer(3));
		input.put(new Point(2,2), new Integer(3));
		
		HashMap<Point,Integer> output = new HashMap<Point,Integer>();
		HashMap<Point,Integer> expectedOutput = new HashMap<Point,Integer>();
		expectedOutput.put(new Point(1,1), new Integer(3));
		expectedOutput.put(new Point(2,1), new Integer(3));
		expectedOutput.put(new Point(1,2), new Integer(3));
		expectedOutput.put(new Point(2,2), new Integer(3));
		
		// when
		output = game.playNextRound(input);
		
		// then
		Assert.assertEquals(output, expectedOutput);
	}
	
	@Test
	public void shouldHandlePond() {
		// given
		HashMap<Point,Integer> input = new HashMap<Point,Integer>();
		input.put(new Point(1,2), new Integer(2));
		input.put(new Point(1,3), new Integer(2));
		input.put(new Point(2,1), new Integer(2));
		input.put(new Point(2,4), new Integer(2));
		input.put(new Point(3,1), new Integer(2));
		input.put(new Point(3,4), new Integer(2));
		input.put(new Point(4,2), new Integer(2));
		input.put(new Point(4,3), new Integer(2));
		
		HashMap<Point,Integer> output = new HashMap<Point,Integer>();
		HashMap<Point,Integer> expectedOutput = new HashMap<Point,Integer>();
		expectedOutput.put(new Point(1,2), new Integer(2));
		expectedOutput.put(new Point(1,3), new Integer(2));
		expectedOutput.put(new Point(2,1), new Integer(2));
		expectedOutput.put(new Point(2,4), new Integer(2));
		expectedOutput.put(new Point(3,1), new Integer(2));
		expectedOutput.put(new Point(3,4), new Integer(2));
		expectedOutput.put(new Point(4,2), new Integer(2));
		expectedOutput.put(new Point(4,3), new Integer(2));
		
		// when
		output = game.playNextRound(input);
		
		// then
		Assert.assertEquals(output, expectedOutput);
	}
	
	@Test
	public void shouldHandleUSSDakota() {
		// given
		HashMap<Point,Integer> input = new HashMap<Point,Integer>();
		input.put(new Point(0,1), new Integer(2));
		input.put(new Point(0,2), new Integer(3));
		input.put(new Point(0,3), new Integer(2));
		input.put(new Point(1,0), new Integer(1));
		input.put(new Point(1,3), new Integer(3));
		input.put(new Point(2,3), new Integer(2));
		input.put(new Point(3,3), new Integer(2));
		input.put(new Point(4,0), new Integer(0));
		input.put(new Point(4,2), new Integer(1));
		
		HashMap<Point,Integer> output = new HashMap<Point,Integer>();
		HashMap<Point,Integer> expectedOutput = new HashMap<Point,Integer>();
		expectedOutput.put(new Point(-1,2), new Integer(3));
		expectedOutput.put(new Point(0,1), new Integer(3));
		expectedOutput.put(new Point(0,2), new Integer(5));
		expectedOutput.put(new Point(0,3), new Integer(4));
		expectedOutput.put(new Point(1,1), new Integer(3));
		expectedOutput.put(new Point(1,3), new Integer(6));
		expectedOutput.put(new Point(1,4), new Integer(4));
		expectedOutput.put(new Point(2,2), new Integer(5));
		expectedOutput.put(new Point(2,3), new Integer(6));
		expectedOutput.put(new Point(2,4), new Integer(4));
		expectedOutput.put(new Point(3,2), new Integer(3));
		expectedOutput.put(new Point(3,3), new Integer(4));
		
		// when
		output = game.playNextRound(input);
		
		// then
		Assert.assertEquals(output, expectedOutput);
	}
	
	@Test
	public void shouldHandleStraightLine() {
		// given
		HashMap<Point,Integer> input = new HashMap<Point,Integer>();
		input.put(new Point(1,1), new Integer(1));
		input.put(new Point(2,1), new Integer(2));
		input.put(new Point(3,1), new Integer(2));
		input.put(new Point(4,1), new Integer(2));
		input.put(new Point(5,1), new Integer(2));
		input.put(new Point(6,1), new Integer(1));
		
		HashMap<Point,Integer> output = new HashMap<Point,Integer>();
		HashMap<Point,Integer> expectedOutput = new HashMap<Point,Integer>();
		expectedOutput.put(new Point(2,0), new Integer(3));
		expectedOutput.put(new Point(3,0), new Integer(5));
		expectedOutput.put(new Point(4,0), new Integer(5));
		expectedOutput.put(new Point(5,0), new Integer(3));
		expectedOutput.put(new Point(2,1), new Integer(5));
		expectedOutput.put(new Point(3,1), new Integer(8));
		expectedOutput.put(new Point(4,1), new Integer(8));
		expectedOutput.put(new Point(5,1), new Integer(5));
		expectedOutput.put(new Point(2,2), new Integer(3));
		expectedOutput.put(new Point(3,2), new Integer(5));
		expectedOutput.put(new Point(4,2), new Integer(5));
		expectedOutput.put(new Point(5,2), new Integer(3));
		
		// when
		output = game.playNextRound(input);
		
		// then
		Assert.assertEquals(output, expectedOutput);
	}
}
