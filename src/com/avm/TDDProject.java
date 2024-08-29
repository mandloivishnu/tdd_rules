package com.avm;

import static org.junit.Assert.*;

import org.junit.Test;

public class TDDProject {

	@Test
	public void testAdd_EmptyString() {
	    assertEquals(0, StringCalculator.add(""));
	}
	
	@Test
	public void testAdd_SingleNumber() {
	    assertEquals(1, StringCalculator.add("1"));
	}
	
	@Test
	public void testAdd_TwoNumbers() {
	    assertEquals(6, StringCalculator.add("1,5"));
	}

	
	@Test
	public void testAdd_MultipleNumbers() {
	    assertEquals(15, StringCalculator.add("1,2,3,4,5"));
	}


	@Test
	public void testAdd_NewLineBetweenNumbers() {
	    assertEquals(6, StringCalculator.add("1\n2,3"));
	}

	@Test
	public void testAdd_CustomDelimiter() {
	    assertEquals(3, StringCalculator.add("//;\n1;2"));
	}

	
	@Test
	public void testMultipleNegativeNumbers() {
	    try {
	    	StringCalculator.add("1,-2,-3,4");
	    } catch (IllegalArgumentException e) {
	        assertEquals("Negative numbers not allowed: [-2, -3]", e.getMessage());
	    }
	}

}
