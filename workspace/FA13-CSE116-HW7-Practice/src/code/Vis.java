package code;

import code.LRStruct.*;
public class Vis implements IAlgo<String,Integer,Object>  {

	@Override
	public String emptyCase(LRStruct<Integer> host, Object arg) {
		
		return "End";
	}

	@Override
	public String nonEmptyCase(LRStruct<Integer> host, Object arg) {
		// TODO Auto-generated method stub
		return host.getDatum().toString()+host.getRest().execute(this, arg);
	}
	public static void main(String[] args) {
		LRStruct<Integer> struc = new LRStruct<Integer>();
		struc.insertFront(5);
		struc.insertFront(5);
		struc.insertFront(5);
		struc.insertFront(5);
		struc.insertFront(1);
		String x = struc.execute(new Vis(), null);
		System.out.println(x);
	}
}
