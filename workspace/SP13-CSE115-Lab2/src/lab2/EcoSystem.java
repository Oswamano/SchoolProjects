package lab2;

public class EcoSystem {

	public EcoSystem() {example1.Terrarium t;
	t=new example1.Terrarium();
	example1.Ant a;
	a= new example1.Ant();
	example1.Ant b;
	b= new example1.Ant();
	t.add(a);
	t.add(b);
	example1.Butterfly c;
	c= new example1.Butterfly();
	example1.Butterfly d;
	d= new example1.Butterfly();
	t.add(c);
	t.add(d);
	example1.Caterpillar e;
	e= new example1.Caterpillar();
	example1.Caterpillar f;
	f= new example1.Caterpillar();
	t.add(e);
	t.add(f);
	a.start();
	b.start();
	c.start();
	d.start();
	e.start();
	f.start();
	a.stop();
	c.stop();
	f.stop();
	}
	
}
