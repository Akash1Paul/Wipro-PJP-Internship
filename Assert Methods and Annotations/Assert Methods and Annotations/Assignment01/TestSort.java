package Assignment01;
import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import org.junit.*;
public class TestSort {
	
	@Test
	public void test() {
		Sort s = new Sort();
		int Expected[] = {1,2,3,4};
		int Actual[] = {1,2,3,4};
		
		assertArrayEquals(s.sortValues(Actual),Expected);
	}

}
