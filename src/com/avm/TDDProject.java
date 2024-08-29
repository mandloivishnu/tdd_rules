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


}
