package tests;

import static org.junit.Assert.assertTrue;

import org.junit.*;
import code.WriteUp;
public class StudentTests {
	private WriteUp write = new WriteUp();
	@Test public void test1(){
	String expected = "Underweight";
	String actual =write.bmiCategory(5.0);
	assertTrue(expected==actual);
	}

	@Test public void test2(){
		String expected = "Normal";
		String actual = write.bmiCategory(20.0);
		assertTrue(expected==actual);
		}
	
	@Test public void test3(){
		String expected = "Overweight";
		String actual = write.bmiCategory(27.0);
		assertTrue(expected==actual);
		}
	
	@Test public void test4(){
		String expected = "Obese";
		String actual = write.bmiCategory(40.0);
		assertTrue(expected==actual);
		}
	@Test (expected = IllegalArgumentException.class)
	public void test5(){
	write.bmiCategory(-1);
		
	
		}
}