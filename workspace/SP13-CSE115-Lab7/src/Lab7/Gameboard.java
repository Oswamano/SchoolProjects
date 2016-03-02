package Lab7;
import javax.swing.*;



public class Gameboard extends javax.swing.JPanel{
	
	 static JFrame _frame;
	
	public static Card a;
	public static Card b;
	
	
	public static void main(String[] args) {
		
		_frame = new JFrame(" Matthew O'Connor Lab7 CSE 115");
		BoxLayout box = new BoxLayout (_frame.getContentPane(), BoxLayout.X_AXIS);
		 a = new Card();
		b = new Card();
		_frame.add(a);
		_frame.add(b);
		a.setIcon(Card.back);
		b.setIcon(Card.back);
		_frame.setLayout(box);
		LabelListener lisa = new LabelListener (a);
		a.addMouseListener(lisa);
		LabelListener lisb = new LabelListener (b);
		b.addMouseListener(lisb);
		
		
		
		_frame.pack();
		_frame.setVisible(true);
		
	}
}
	
	
	
		
		
	
	
	
	

