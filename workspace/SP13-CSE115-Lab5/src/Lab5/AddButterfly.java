package Lab5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButterfly implements ActionListener {
	example1.Terrarium _t;
	public AddButterfly(example1.Terrarium t){
	
	_t=t;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		example1.Butterfly _b = new example1.Butterfly();
		_t.add(_b);
		_b.start();
		
	}

}