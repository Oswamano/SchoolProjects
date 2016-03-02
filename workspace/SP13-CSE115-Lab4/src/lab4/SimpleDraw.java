package lab4;

public class SimpleDraw {
	
	public SimpleDraw() {
		supportcode.Window w = new supportcode.Window();
		lab4.ColorHolder h = new ColorHolder();
		lab4.SquareButton s = new SquareButton(w,h);
		lab4.CircleButton c = new CircleButton(w,h);
		lab4.ColorButton b = new ColorButton(java.awt.Color.BLUE,h);
		lab4.ColorButton r = new ColorButton(java.awt.Color.RED,h);
		lab4.ColorButton g = new ColorButton(java.awt.Color.GREEN,h);
	w.addCircleButton(c);
	w.addSquareButton(s);
	w.addColorButton(r);
	w.addColorButton(b);
	w.addColorButton(g);
		
		
		
		
		
	}
}
