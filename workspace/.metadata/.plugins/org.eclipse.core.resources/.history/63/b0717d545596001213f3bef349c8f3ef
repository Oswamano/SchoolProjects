package Lab5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OmniButton implements ActionListener {
	example1.Terrarium _t ;
	public OmniButton(example1.Terrarium t){
	
	_t=t;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int x = 0;
		while(x<1000){
			x=x+1;
		example1.Caterpillar _c = new example1.Caterpillar();
		_t.add(_c);
		_c.start();
		example1.Butterfly _b = new example1.Butterfly();
		_t.add(_b);
		_b.start();
		example1.Ant _a = new example1.Ant();
		_t.add(_a);
		_a.start();
		}
	}

}
