package Lab5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCaterpillar implements ActionListener {
	example1.Terrarium _t ;
	public AddCaterpillar(example1.Terrarium t){
	
	_t=t;
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
	
		example1.Caterpillar _c = new example1.Caterpillar();
		_t.add(_c);
		_c.start();
		
		// TODO Auto-generated method stub
	
	}

}
