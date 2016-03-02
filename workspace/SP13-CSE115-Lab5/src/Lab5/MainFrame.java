

package Lab5;
import java.awt.BorderLayout;

import javax.swing.JButton;
public class MainFrame {

	public MainFrame(){
		example1.Terrarium ter= new example1.Terrarium();
		javax.swing.JFrame frame = new javax.swing.JFrame("MainFrame");
		
		JButton a = new JButton("Ant!");
		JButton b = new JButton("Butterfly!");
		JButton c = new JButton("Caterpillar!");
		JButton o = new JButton("Omni");
		a.addActionListener(new AddAnt(ter));
		b.addActionListener(new AddButterfly(ter));
		c.addActionListener(new AddCaterpillar(ter));
		o.addActionListener(new OmniButton(ter));
		
		frame.add(a, BorderLayout.WEST);
		frame.add(b,BorderLayout.EAST);
		frame.add(c,BorderLayout.SOUTH);
		frame.add(o,BorderLayout.NORTH);
		frame.pack();
		frame.setVisible(true);
	
		
	}
	
	public static void main(String[]args){
		new MainFrame();
	}
	}


