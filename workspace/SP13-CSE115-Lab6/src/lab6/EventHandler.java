package lab6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class EventHandler implements ActionListener {
private lab6.Application _app;
	public EventHandler(lab6.Application app){
		_app=app;
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		_app.shuffle();
		
		
		
		
		

	}

}
