package lab3;

public class EcoOne {
	private example1.Terrarium _t1;
	public EcoOne() {
	_t1 = new example1.Terrarium();
	}
	
	public void addAnt(){
		example1.Ant a;
		a = new example1.Ant();
		_t1.add(a);
		a.start();
		}
	public void addCaterpillar(){
		example1.Caterpillar c;
		c = new example1.Caterpillar();
		_t1.add(c);
		c.start();
		}
	public void addButterfly(){
		example1.Butterfly b;
		b = new example1.Butterfly();
		_t1.add(b);
		b.start();
		}
	

}

