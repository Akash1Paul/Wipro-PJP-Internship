package com.wipro.test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import Assignment01.Sort;

public class TestCheckpresence {
	
	@Test
	public void SortValues() {
		Sort1 s = new Sort1();
		assertTrue(s.checkPresence("abc","abc"));
		
		
	}

}
