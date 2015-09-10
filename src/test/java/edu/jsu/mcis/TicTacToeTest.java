package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
	@Test
	public void testInitialBoardIsEmpty() {
		TicTacToe board = new TicTacToe();
		for(int row = 0; row < 3; row++){
			for(int col = 0; col < 3; col++){
				assertEquals(TicTacToe.Mark.EMPTY, board.getMark(row,col));
			}
		}	
	}
	
	@Test
	public void testMarkXInUpperRightCorner() {
		TicTacToe board = new TicTacToe();
		board.getInput(2,2);
		assertEquals(TicTacToe.Mark.X, board.getMark(2,2));
	}
	
	@Test
	public void testMarkOInBottomLeftCorner() {
		TicTacToe board = new TicTacToe();
		board.getInput(0,0);
		assertEquals(TicTacToe.Mark.O, board.getMark(0,0));
	}
	
	@Test
	public void testUnableToMarkOverExistingMark() {
		assertTrue(false);
	}
	
	@Test
	public void testGameIsNotOverAfterTheFirstMark() {
		assertTrue(false);
	}
	
	@Test
	public void testGameIsWonByXHorizontallyAcrossTopRow() {
		assertTrue(false);
	}
	
	@Test
	public void testGameIsOverByTieIfAllLocationsAreFilled() {
		assertTrue(false);
	}	
}
