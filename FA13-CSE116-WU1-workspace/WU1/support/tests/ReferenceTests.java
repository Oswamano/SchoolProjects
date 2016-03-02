package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ReferenceTests {
	
	private code.WriteUp _class;
	
	private void testOfSolution(String s, char c1, char c2, char expected) {
		char actual = _class.solution(s,c1,c2);
		assertTrue("solution(\""+s+"\", '"+c1+"', '"+c2+"') should be '"+expected+"' but was '"+actual+"',",
				expected == actual);
	}

	@Before public void setup() {
		_class = new code.WriteUp(); 
	}
	
	@Test public void testOfSolution_00() { testOfSolution("", 'a', 'b', 'a'); }
	@Test public void testOfSolution_01() { testOfSolution("an aardvark is able", 'a', 'b', 'a'); }
	@Test public void testOfSolution_02() { testOfSolution("b..b..blistering blue barnacles", 'a', 'b', 'b'); }
	@Test public void testOfSolution_03() { testOfSolution("AAAb", 'a', 'b', 'b'); }
	@Test public void testOfSolution_04() { testOfSolution("cde", 'a', 'b', 'a'); }
	@Test public void testOfSolution_05() { testOfSolution("cde", 'a', 'd', 'd'); }
	@Test public void testOfSolution_06() { testOfSolution("creepy crawlies", 'c', 'e', 'e'); }
	@Test public void testOfSolution_07() { testOfSolution("creepy crawlies", 'e', 'c', 'e'); }
	@Test public void testOfSolution_08() { testOfSolution("creepy crawlies", 'c', 'r', 'c'); }
	@Test public void testOfSolution_09() { testOfSolution("creepy crawlies", 'r', 'c', 'r'); }
}
