package lab3;

public class EcoTwo {
	    
		private example1.Terrarium _t2;
		private example1.Terrarium _t1;
		public EcoTwo() {
		_t2= new example1.Terrarium();
		_t1= new example1.Terrarium();
		
		
		}
		public void addAnt(){
			example1.Ant a;
			a = new example1.Ant();
			example1.Terrarium _t3;
			_t3=_t1;
			_t1.add(a);
			a.start();
			_t1=_t2;
			_t2=_t3;
			_t3=_t1;
			}
		public void addCaterpillar(){
			example1.Caterpillar c;
			c = new example1.Caterpillar();
			example1.Terrarium _t3;
			_t3=_t1;
			_t1.add(c);
			c.start();
			_t1=_t2;
			_t2=_t3;
			_t3=_t1;
			
			}
		public void addButterfly(){
			example1.Butterfly b;
			b = new example1.Butterfly();
			example1.Terrarium _t3;
			_t3=_t1;
			
			_t1.add(b);
			b.start();
			_t1=_t2;
			_t2=_t3;
			_t3=_t1;
			}

}
