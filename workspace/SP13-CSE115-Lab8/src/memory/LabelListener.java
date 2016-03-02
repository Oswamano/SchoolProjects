package memory;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import memory.Game;

public class LabelListener  implements MouseListener {
private memory.Card _card;
private memory.Card _c;

	public LabelListener(memory.Card c){
	_card=c;
	
		
		
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
	flip(_card);	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// system.currentTime

	}
	
	
		
	

public     void flip(memory.Card c){
	_c=c;
	Icon x = _c.getIcon();
	
	if(x==null){
		_c.setIcon(null);
		
	}
	
	else if (x==memory.Card.Back){
		_c.setIcon(_c.front);
		
		
	}
	
	else   {
		_c.setIcon(memory.Card.Back);
		
	}
	Game.State(_c);
	
}
}
	
	


	
	
	


