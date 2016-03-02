package Lab7;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;

public class LabelListener  implements MouseListener {
private Lab7.Card _card;
private Lab7.Card _c;
	
	public LabelListener(Lab7.Card c){
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
		// TODO Auto-generated method stub

	}
	
	
		
	

public   void flip(Lab7.Card c){
	_c=c;
	Icon x = _c.getIcon();
	
	if (x==Lab7.Card.back){
		_c.setIcon(Lab7.Card.front);
		
		
	}
	
	else  {
		_c.setIcon(Lab7.Card.back);
	
		
	}


}
}
	
	


	
	
	


