package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestStringConcat {
	DailyTasks t = new DailyTasks();
	@Test
	public void doStringConcat() {
		
		assertEquals("Tom cat",t.DoString("Tom","cat"));
		
	}

}
