package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import code.LRStruct;
import code.MathyVis;
public class StudentTests {
	@Test
	public void mathytest(){
		LRStruct<Integer> struc = new LRStruct<Integer>();
		struc.insertFront(5);
		struc.insertFront(5);
		struc.insertFront(5);
		struc.insertFront(5);
		struc.insertFront(1);
		int actual  = struc.execute(new MathyVis(), null);
		int expected = 105;
		assertTrue(expected==actual);
	}

	

}
