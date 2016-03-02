package lab4;

public class SquareButton {
	private supportcode.Window _w;
	private ColorHolder _c;
	
	
	public SquareButton(supportcode.Window w, ColorHolder c) {
		_w=w;
		_c=c;
		
	}
	
	public void buttonPressed(){
		supportcode.Square s;
		s= new supportcode.Square(_c);
		_w.addSquare(s);
		
		
		
	}
	
}
;
