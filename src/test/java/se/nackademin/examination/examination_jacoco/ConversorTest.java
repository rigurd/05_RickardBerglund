package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorTest {

	@Test
	public void testConversor() {
		Conversor conversor = new Conversor();
		conversor.setNameConverterArrayValues();
		assertEquals(conversor.getNameConverterArray().get(0), "Your first name is smaller than your last name");
	}

	@Test
	public void testGenderConverserArrayValues(){
		Conversor conv = new Conversor();
		conv.setGenderConverterArrayValues();
		assertEquals(conv.getGenderConverterArray().get(1), "woman!");
	}
	
	@Test
	public void testAgeConverterArrayValues(){
		Conversor conv = new Conversor();
		conv.setAgeConverterArrayValues();
		assertEquals(conv.getAgeConverterArray().get(0), "You are young and talented! Things will come your way soon enough! ");
	}
	
	@Test
	public void testCityConverterArrayValues(){
		Conversor conv = new Conversor();
		conv.setCityConverterArrayValues();
		assertEquals(conv.getCityConverterArray().get(5)," F, ");
	}
}
