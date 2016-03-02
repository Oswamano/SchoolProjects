package lab4;

public class CircleButton {
	private supportcode.Window _w;
	private ColorHolder _c;
	public CircleButton(supportcode.Window w, ColorHolder c){
		_w=w;
		_c=c;
	}
	public void buttonPressed(){
		supportcode.Circle s;
		s= new supportcode.Circle(_c);
		_w.addCircle(s);
		
		
		
	}
}
