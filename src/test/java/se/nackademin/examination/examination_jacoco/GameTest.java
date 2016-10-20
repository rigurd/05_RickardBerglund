package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GameTest {

	@Test
	public void testMethod1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", i, 1);
	}
	
	@Test
	public void testMethodRun(){
		Game game = new Game();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "32", "Fortaleza"));
		game.run(values);
		
	}
	
	@Test
	public void testGetGenderFromValueInput(){
		Game game = new Game();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "32", "Fortaleza"));
		game.getGenderFromInputValues(values);
		assertEquals("The result should be 'M'", values.get(3).charAt(0), 'M');
		
	}
	
	@Test
	public void testRunGame(){
		Game game = new Game();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "32", "Fortaleza"));
		game.runGame("Game", "Rafael", "Silva", 'M', 32, "Fortaleza");
	}
	
	@Test
	public void testCalculateOutputBasedOnNames(){
		Game game = new Game();

		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", i, 1);
		i = game.calculateOutPutBasedOnNames("Rafael", "Silvaaaaa");
		assertEquals("The result should be 0", i, 0);
		i = game.calculateOutPutBasedOnNames("Rafae", "Silva");
		assertEquals("The result should be 2", i, 2);
		
	}
	
	@Test
	public void testCalculateOutputBasedOnGender(){
		Game game = new Game();
		
		int i = game.calculateOutPutBasedOnGender('M');
		assertEquals("the result should be 0", i, 0);
		i = game.calculateOutPutBasedOnGender('F');
		assertEquals("the result should be 1", i, 1);
		i = game.calculateOutPutBasedOnGender('P');
		assertEquals("the result should be 2", i, 2);
	}

	@Test
	public void testCalculateOutputBasedOnAge(){
		Game game = new Game();
		
		int i = game.calculateOutPutBasedOnAge(15);
		assertEquals("the result should be 0", i, 0);
		i = game.calculateOutPutBasedOnAge(30);
		assertEquals("the result should be 1", i, 1);
	}
	
	@Test
	public void testCalculateOutputBasedOnHomeCity(){
		Game game = new Game();
		
		int i = game.calculateOutPutBasedOnHomeCity("Adelstan");
		assertEquals("the result should be 0", i, 0);
		i = game.calculateOutPutBasedOnHomeCity("Boden");
		assertEquals("the result should be 1", i, 1);
		i = game.calculateOutPutBasedOnHomeCity("Curlytown");
		assertEquals("the result should be 2", i, 2);
		i = game.calculateOutPutBasedOnHomeCity("Delsbo");
		assertEquals("the result should be 3", i, 3);
		i = game.calculateOutPutBasedOnHomeCity("Edsbyn");
		assertEquals("the result should be 4", i, 4);
		i = game.calculateOutPutBasedOnHomeCity("Furcoat");
		assertEquals("the result should be 5", i, 5);
		i = game.calculateOutPutBasedOnHomeCity("Godisbyn");
		assertEquals("the result should be 6", i, 6);
		i = game.calculateOutPutBasedOnHomeCity("Hammarby");
		assertEquals("the result should be 7", i, 7);
		i = game.calculateOutPutBasedOnHomeCity("Ingelsta");
		assertEquals("the result should be 8", i, 8);
		i = game.calculateOutPutBasedOnHomeCity("Jordbro");
		assertEquals("the result should be 9", i, 9);
		i = game.calculateOutPutBasedOnHomeCity("Zorro");
		assertEquals("the result should be 10", i, 10);
		
	}
	
	@Test
	public void testBuildFinalString(){
		Game game = new Game();
		ResultFromInputs rfi = new ResultFromInputs();
		Conversor conv = new Conversor();
		game.buildFinalString("Rafael", "Silva", rfi, conv);
		
	}
}
