package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResultsFromInputsTest {

	@Test
	public void testNameGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForNameLenght(10);
		assertEquals("The result should be 10", resultsFromInputs.getResultForNameLenght(), 10);
	}

	@Test
	public void testGenderGettersAndSetters(){
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForGender(15);
		assertEquals("The result should be 15", resultsFromInputs.getResultForGender(), 15);
	}
	
	@Test
	public void testAgeGettersAndSetters(){
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForAge(20);
		assertEquals("The result should be 20", resultsFromInputs.getResultForAge(), 20);
	}
	
	@Test
	public void testHomecityGettersAndSetters(){
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForHomeCity(25);
		assertEquals("The result should be 25", resultsFromInputs.getResultForHomeCity(), 25);
	}
}
