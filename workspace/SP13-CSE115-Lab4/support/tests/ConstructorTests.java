package tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;

import lab4.CircleButton;
import lab4.ColorButton;
import lab4.ColorHolder;
import lab4.SimpleDraw;
import lab4.SquareButton;

import org.junit.Test;

public class ConstructorTests {
	
	@Test public void constructorTest1() {
		try {
		    Constructor<CircleButton> ctor = CircleButton.class.getDeclaredConstructor(supportcode.Window.class, lab4.ColorHolder.class);
		    ctor.setAccessible(true);
		} 
		catch (NoSuchMethodException x) {
			fail("You need to define a constructor for the CircleButton class that matches its description in the UML class diagram.  Look carefully at the parameters!");
		}
		assertTrue(true);
	}

	@Test public void constructorTest2() {
		try {
		    Constructor<SquareButton> ctor = SquareButton.class.getDeclaredConstructor(supportcode.Window.class, lab4.ColorHolder.class);
		    ctor.setAccessible(true);
		} 
		catch (NoSuchMethodException x) {
			fail("You need to define a constructor for the CircleButton class that matches its description in the UML class diagram.  Look carefully at the parameters!");
		}
		assertTrue(true);
	}

	@Test public void constructorTest3() {
		try {
		    Constructor<ColorButton> ctor = ColorButton.class.getDeclaredConstructor(java.awt.Color.class, lab4.ColorHolder.class);
		    ctor.setAccessible(true);
		} 
		catch (NoSuchMethodException x) {
			fail("You need to define a constructor for the CircleButton class that matches its description in the UML class diagram.  Look carefully at the parameters!");
		}
		assertTrue(true);
	}

	@Test public void constructorTest4() {
		try {
		    Constructor<ColorHolder> ctor = ColorHolder.class.getDeclaredConstructor();
		    ctor.setAccessible(true);
		} 
		catch (NoSuchMethodException x) {
			fail("You need to define a constructor for the CircleButton class that matches its description in the UML class diagram.  Look carefully at the parameters!");
		}
		assertTrue(true);
	}

	@Test public void constructorTest5() {
		try {
		    Constructor<SimpleDraw> ctor = SimpleDraw.class.getDeclaredConstructor();
		    ctor.setAccessible(true);
		} 
		catch (NoSuchMethodException x) {
			fail("You need to define a constructor for the CircleButton class that matches its description in the UML class diagram.  Look carefully at the parameters!");
		}
		assertTrue(true);
	}

}
