package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {

	@Test
	public void test1() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				result.contains("The name of the homecity is big and the participant is 30 or older"));

	}
	
	@Test
	public void testResultStringNamesAndAge() {
		DataAnalysis da = new DataAnalysis();
		ArrayList<String> val = new ArrayList<String>();
		ArrayList<String> val1 = new ArrayList<String>();
		ArrayList<String> val2 = new ArrayList<String>();
	
		
		val.addAll(Arrays.asList("Game", "Rafael", "Silvaaaa", "M", "30", "Fortaleza"));
		String result = da.buildFinalString(val);
		assertTrue(da.getResultStringNamesAndAge(val),
				result.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));

		val1.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "32", "Fortaleza"));
		String result1 = da.buildFinalString(val1);
		assertTrue(da.getResultStringNamesAndAge(val1),
				result1.contains("The first name is greater or equals in size to the last name and the participant older than 30"));
	
		val2.addAll(Arrays.asList("Game", "Rafa", "Silv", "M", "32", "Fortaleza"));
		String result2 = da.buildFinalString(val2);
		assertTrue(da.getResultStringNamesAndAge(val2),
				result2.contains("No analysis was performed"));
	}
	
	@Test
	public void testResultStringHomecityAndAge(){
		DataAnalysis da = new DataAnalysis();
		ArrayList<String> val = new ArrayList<String>();
		ArrayList<String> val1 = new ArrayList<String>();
		ArrayList<String> val2 = new ArrayList<String>();
		ArrayList<String> val3 = new ArrayList<String>();
		
		val.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "32", "For"));
		String result = da.buildFinalString(val);
		assertTrue(da.getResultStringNamesAndAge(val),
				result.contains("The name of the homecity is small and the participant is 30 or older"));
		
		val1.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "29", "For"));
		String result1 = da.buildFinalString(val1);
		assertTrue(da.getResultStringNamesAndAge(val1),
				result1.contains("The name of the homecity is small and the participant is younger than 30"));
		
		val2.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "32", "Fortal"));
		String result2 = da.buildFinalString(val2);
		assertTrue(da.getResultStringNamesAndAge(val2),
				result2.contains("The name of the homecity is big and the participant is 30 or older"));
		
		val3.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "29", "Fortal"));
		String result3 = da.buildFinalString(val3);
		assertTrue(da.getResultStringNamesAndAge(val3),
				result3.contains("The name of the homecity is big and the participant is younger than 30"));
	}
}
