package lab4;

public class ColorButton {
	private java.awt.Color _c;
	private ColorHolder _h;
	
	public ColorButton(java.awt.Color c, ColorHolder h) {
		_h=h;
		_c=c;
	}
	
	public void buttonPressed() {
	_h.setColor(_c);
		
	}
	
}
