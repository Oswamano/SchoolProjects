package tests;

import static org.junit.Assert.*;

import org.junit.*;

import code.LRStruct;

public class StudentTests {
	
	@Test public boolean test1(){
		LRStruct<String> struct = new LRStruct<String>();
		struct.insertFront("Wilma");
		int actual = LengthVisitor(struct);
		int expected = 5;
		assertTrue(expected = actual);
		
		
		
	}
	
	@Test public boolean test1(){
		LRStruct<String> struct = new LRStruct<String>();
		struct.insertFront("Wilma");
		struct.insertFront("Pebbles");
		int actual = LengthVisitor(struct);
		int expected = 12;
		assertTrue(expected = actual);
		
		
		
	}
	
	@Test public boolean test1(){
		LRStruct<String> struct = new LRStruct<String>();
		int actual = LengthVisitor(struct);
		int expected = 0;
		assertTrue(expected = actual);
		
		
		
	}

}
